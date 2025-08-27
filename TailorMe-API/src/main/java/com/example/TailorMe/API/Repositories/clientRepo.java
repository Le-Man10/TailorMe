package com.example.TailorMe.API.Repositories;

import com.example.TailorMe.API.Models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface clientRepo extends JpaRepository<Client,Long> {
}
