package com.springrestful.service;

import java.util.List;
import java.util.Optional;

import com.springrestful.repositry.ClientEntity;

public interface ClinteService {
	public ClientEntity creatClient(ClientEntity centity);
	
	public List<ClientEntity>getAllDetail();
	
    public Optional<ClientEntity> getUserDetailId(int id);
    
    public Optional updatUserDtail(int id ,ClientEntity user);
}
