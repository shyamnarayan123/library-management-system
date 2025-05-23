package com.springrestful.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springrestful.repositry.ClientEntity;
import com.springrestful.repositry.ClientRepositry;

@Service
public class ClintSeviceImpl implements ClinteService{
@Autowired
ClientRepositry clientrepositry;

@Override
public ClientEntity creatClient(ClientEntity centity) {
	
	return clientrepositry.save(centity) ;
}

@Override
public List<ClientEntity> getAllDetail() {
	
	return clientrepositry.findAll();
}

@Override
public Optional<ClientEntity> getUserDetailId(int id) {
	
	return clientrepositry.findById(id);
}

@Override
public Optional<ClientEntity> updatUserDtail(int id, ClientEntity user) {
	
	return clientrepositry.findById(id);
}

}
