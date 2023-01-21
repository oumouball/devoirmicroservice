package com.groupeisi.moneymobile.repository;

import com.groupeisi.moneymobile.model.Client;
import com.groupeisi.moneymobile.model.Transfert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransfertRepository extends JpaRepository<Transfert, Integer> {}
