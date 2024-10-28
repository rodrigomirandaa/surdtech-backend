package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Video;
import com.example.demo.repository.VideoRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/video")
public class VideoController {
    
    @Autowired
    private VideoRepository videoRepository;
    
    @PostMapping
    public Video addVideo(@RequestBody Video video) {
        return videoRepository.save(video);
    }

    @GetMapping
    public List<Video> getAllVideos() {
        return videoRepository.findAll();
    }

    @GetMapping("/{id}")
     public ResponseEntity<Video> getVideoById(@PathVariable Long id) {
        return videoRepository.findById(id)
            .map(video -> ResponseEntity.ok(video))
            .orElse(ResponseEntity.notFound().build());
    }
    @PutMapping("/{id}")
    public ResponseEntity<Video> updateVideo(@PathVariable Long id, @RequestBody Video updatedVideo) {
        return videoRepository.findById(id)
            .map(video -> {
                video.setTitulo(updatedVideo.getTitulo());
                video.setUrl(updatedVideo.getUrl());
                video.setDescricao(updatedVideo.getDescricao());
                Video savedVideo = videoRepository.save(video);
                return ResponseEntity.ok(savedVideo);
            })
            .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteVideo(@PathVariable Long id) {
        return videoRepository.findById(id)
            .map(video -> {
                videoRepository.delete(video);
                return ResponseEntity.<Void>noContent().build(); // Especifica o tipo Void aqui
            })
            .orElseGet(() -> ResponseEntity.notFound().build());

}
}