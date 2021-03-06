package com.trustvip.service;

import com.trustvip.domain.enumeration.ArticleStatus;
import com.trustvip.domain.enumeration.ArticleType;
import com.trustvip.service.dto.ArticleDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing Article.
 */
public interface ArticleService {

    /**
     * Save a article.
     *
     * @param articleDTO the entity to save
     * @return the persisted entity
     */
    ArticleDTO save(ArticleDTO articleDTO);

    /**
     * Get all the articles.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<ArticleDTO> findAll(Pageable pageable);

    /**
     * Get the "id" article.
     *
     * @param id the id of the entity
     * @return the entity
     */
    ArticleDTO findOne(Long id);

    /**
     * Delete the "id" article.
     *
     * @param id the id of the entity
     */
    void delete(Long id);

    /**
     * Search for the article corresponding to the query.
     *
     * @param query the query of the search
     * 
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<ArticleDTO> search(String query, Pageable pageable);
    
    /**
     * Get all the articles by status
     *
     * @param pageable
     *            the pagination information
     * @return the list of entities
     */
    Page<ArticleDTO> findAllByStatus(ArticleStatus status, Pageable pageable);

    void sendEmail(String email, Long id);

    long getCountByType(ArticleType type);

    long getCountByStatus(ArticleStatus status);
}
