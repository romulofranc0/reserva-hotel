package br.com.romulofranc0.reserva_hotel.infra.repositoriesImpl;

import br.com.romulofranc0.reserva_hotel.domain.entities.Property;
import br.com.romulofranc0.reserva_hotel.domain.repositories.PropertyRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class PropertyRepositoryImpl implements PropertyRepository {
    @Override
    public void flush() {

    }

    @Override
    public <S extends Property> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Property> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Property> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Property getOne(Long aLong) {
        return null;
    }

    @Override
    public Property getById(Long aLong) {
        return null;
    }

    @Override
    public Property getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Property> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Property> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Property> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Property> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Property> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Property> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Property, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Property> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Property> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Property> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Property> findAll() {
        return List.of();
    }

    @Override
    public List<Property> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Property entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Property> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Property> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Property> findAll(Pageable pageable) {
        return null;
    }
}
