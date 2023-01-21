package com.groupeisi.moneymobile.repository;

import com.groupeisi.moneymobile.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {}
