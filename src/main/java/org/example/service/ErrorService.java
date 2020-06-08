package org.example.service;
import org.example.exception.MyException;
import org.example.generic.GenericRepository;

public interface ErrorService extends GenericRepository<MyException> {
}