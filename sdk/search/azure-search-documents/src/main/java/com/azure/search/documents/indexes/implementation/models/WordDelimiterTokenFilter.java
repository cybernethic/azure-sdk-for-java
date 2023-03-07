// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Splits words into subwords and performs optional transformations on subword groups. This token filter is implemented
 * using Apache Lucene.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "@odata.type",
        visible = true)
@JsonTypeName("#Microsoft.Azure.Search.WordDelimiterTokenFilter")
@Fluent
public final class WordDelimiterTokenFilter extends TokenFilter {
    /*
     * Identifies the concrete type of the token filter.
     */
    @JsonTypeId
    @JsonProperty(value = "@odata.type", required = true)
    private String odataType = "#Microsoft.Azure.Search.WordDelimiterTokenFilter";

    /*
     * A value indicating whether to generate part words. If set, causes parts of words to be generated; for example
     * "AzureSearch" becomes "Azure" "Search". Default is true.
     */
    @JsonProperty(value = "generateWordParts")
    private Boolean generateWordParts;

    /*
     * A value indicating whether to generate number subwords. Default is true.
     */
    @JsonProperty(value = "generateNumberParts")
    private Boolean generateNumberParts;

    /*
     * A value indicating whether maximum runs of word parts will be catenated. For example, if this is set to true,
     * "Azure-Search" becomes "AzureSearch". Default is false.
     */
    @JsonProperty(value = "catenateWords")
    private Boolean catenateWords;

    /*
     * A value indicating whether maximum runs of number parts will be catenated. For example, if this is set to true,
     * "1-2" becomes "12". Default is false.
     */
    @JsonProperty(value = "catenateNumbers")
    private Boolean catenateNumbers;

    /*
     * A value indicating whether all subword parts will be catenated. For example, if this is set to true,
     * "Azure-Search-1" becomes "AzureSearch1". Default is false.
     */
    @JsonProperty(value = "catenateAll")
    private Boolean catenateAll;

    /*
     * A value indicating whether to split words on caseChange. For example, if this is set to true, "AzureSearch"
     * becomes "Azure" "Search". Default is true.
     */
    @JsonProperty(value = "splitOnCaseChange")
    private Boolean splitOnCaseChange;

    /*
     * A value indicating whether original words will be preserved and added to the subword list. Default is false.
     */
    @JsonProperty(value = "preserveOriginal")
    private Boolean preserveOriginal;

    /*
     * A value indicating whether to split on numbers. For example, if this is set to true, "Azure1Search" becomes
     * "Azure" "1" "Search". Default is true.
     */
    @JsonProperty(value = "splitOnNumerics")
    private Boolean splitOnNumerics;

    /*
     * A value indicating whether to remove trailing "'s" for each subword. Default is true.
     */
    @JsonProperty(value = "stemEnglishPossessive")
    private Boolean stemEnglishPossessive;

    /*
     * A list of tokens to protect from being delimited.
     */
    @JsonProperty(value = "protectedWords")
    private List<String> protectedWords;

    /**
     * Creates an instance of WordDelimiterTokenFilter class.
     *
     * @param name the name value to set.
     */
    @JsonCreator
    public WordDelimiterTokenFilter(@JsonProperty(value = "name", required = true) String name) {
        super(name);
    }

    /**
     * Get the odataType property: Identifies the concrete type of the token filter.
     *
     * @return the odataType value.
     */
    public String getOdataType() {
        return this.odataType;
    }

    /**
     * Get the generateWordParts property: A value indicating whether to generate part words. If set, causes parts of
     * words to be generated; for example "AzureSearch" becomes "Azure" "Search". Default is true.
     *
     * @return the generateWordParts value.
     */
    public Boolean isGenerateWordParts() {
        return this.generateWordParts;
    }

    /**
     * Set the generateWordParts property: A value indicating whether to generate part words. If set, causes parts of
     * words to be generated; for example "AzureSearch" becomes "Azure" "Search". Default is true.
     *
     * @param generateWordParts the generateWordParts value to set.
     * @return the WordDelimiterTokenFilter object itself.
     */
    public WordDelimiterTokenFilter setGenerateWordParts(Boolean generateWordParts) {
        this.generateWordParts = generateWordParts;
        return this;
    }

    /**
     * Get the generateNumberParts property: A value indicating whether to generate number subwords. Default is true.
     *
     * @return the generateNumberParts value.
     */
    public Boolean isGenerateNumberParts() {
        return this.generateNumberParts;
    }

    /**
     * Set the generateNumberParts property: A value indicating whether to generate number subwords. Default is true.
     *
     * @param generateNumberParts the generateNumberParts value to set.
     * @return the WordDelimiterTokenFilter object itself.
     */
    public WordDelimiterTokenFilter setGenerateNumberParts(Boolean generateNumberParts) {
        this.generateNumberParts = generateNumberParts;
        return this;
    }

    /**
     * Get the catenateWords property: A value indicating whether maximum runs of word parts will be catenated. For
     * example, if this is set to true, "Azure-Search" becomes "AzureSearch". Default is false.
     *
     * @return the catenateWords value.
     */
    public Boolean isCatenateWords() {
        return this.catenateWords;
    }

    /**
     * Set the catenateWords property: A value indicating whether maximum runs of word parts will be catenated. For
     * example, if this is set to true, "Azure-Search" becomes "AzureSearch". Default is false.
     *
     * @param catenateWords the catenateWords value to set.
     * @return the WordDelimiterTokenFilter object itself.
     */
    public WordDelimiterTokenFilter setCatenateWords(Boolean catenateWords) {
        this.catenateWords = catenateWords;
        return this;
    }

    /**
     * Get the catenateNumbers property: A value indicating whether maximum runs of number parts will be catenated. For
     * example, if this is set to true, "1-2" becomes "12". Default is false.
     *
     * @return the catenateNumbers value.
     */
    public Boolean isCatenateNumbers() {
        return this.catenateNumbers;
    }

    /**
     * Set the catenateNumbers property: A value indicating whether maximum runs of number parts will be catenated. For
     * example, if this is set to true, "1-2" becomes "12". Default is false.
     *
     * @param catenateNumbers the catenateNumbers value to set.
     * @return the WordDelimiterTokenFilter object itself.
     */
    public WordDelimiterTokenFilter setCatenateNumbers(Boolean catenateNumbers) {
        this.catenateNumbers = catenateNumbers;
        return this;
    }

    /**
     * Get the catenateAll property: A value indicating whether all subword parts will be catenated. For example, if
     * this is set to true, "Azure-Search-1" becomes "AzureSearch1". Default is false.
     *
     * @return the catenateAll value.
     */
    public Boolean isCatenateAll() {
        return this.catenateAll;
    }

    /**
     * Set the catenateAll property: A value indicating whether all subword parts will be catenated. For example, if
     * this is set to true, "Azure-Search-1" becomes "AzureSearch1". Default is false.
     *
     * @param catenateAll the catenateAll value to set.
     * @return the WordDelimiterTokenFilter object itself.
     */
    public WordDelimiterTokenFilter setCatenateAll(Boolean catenateAll) {
        this.catenateAll = catenateAll;
        return this;
    }

    /**
     * Get the splitOnCaseChange property: A value indicating whether to split words on caseChange. For example, if this
     * is set to true, "AzureSearch" becomes "Azure" "Search". Default is true.
     *
     * @return the splitOnCaseChange value.
     */
    public Boolean isSplitOnCaseChange() {
        return this.splitOnCaseChange;
    }

    /**
     * Set the splitOnCaseChange property: A value indicating whether to split words on caseChange. For example, if this
     * is set to true, "AzureSearch" becomes "Azure" "Search". Default is true.
     *
     * @param splitOnCaseChange the splitOnCaseChange value to set.
     * @return the WordDelimiterTokenFilter object itself.
     */
    public WordDelimiterTokenFilter setSplitOnCaseChange(Boolean splitOnCaseChange) {
        this.splitOnCaseChange = splitOnCaseChange;
        return this;
    }

    /**
     * Get the preserveOriginal property: A value indicating whether original words will be preserved and added to the
     * subword list. Default is false.
     *
     * @return the preserveOriginal value.
     */
    public Boolean isPreserveOriginal() {
        return this.preserveOriginal;
    }

    /**
     * Set the preserveOriginal property: A value indicating whether original words will be preserved and added to the
     * subword list. Default is false.
     *
     * @param preserveOriginal the preserveOriginal value to set.
     * @return the WordDelimiterTokenFilter object itself.
     */
    public WordDelimiterTokenFilter setPreserveOriginal(Boolean preserveOriginal) {
        this.preserveOriginal = preserveOriginal;
        return this;
    }

    /**
     * Get the splitOnNumerics property: A value indicating whether to split on numbers. For example, if this is set to
     * true, "Azure1Search" becomes "Azure" "1" "Search". Default is true.
     *
     * @return the splitOnNumerics value.
     */
    public Boolean isSplitOnNumerics() {
        return this.splitOnNumerics;
    }

    /**
     * Set the splitOnNumerics property: A value indicating whether to split on numbers. For example, if this is set to
     * true, "Azure1Search" becomes "Azure" "1" "Search". Default is true.
     *
     * @param splitOnNumerics the splitOnNumerics value to set.
     * @return the WordDelimiterTokenFilter object itself.
     */
    public WordDelimiterTokenFilter setSplitOnNumerics(Boolean splitOnNumerics) {
        this.splitOnNumerics = splitOnNumerics;
        return this;
    }

    /**
     * Get the stemEnglishPossessive property: A value indicating whether to remove trailing "'s" for each subword.
     * Default is true.
     *
     * @return the stemEnglishPossessive value.
     */
    public Boolean isStemEnglishPossessive() {
        return this.stemEnglishPossessive;
    }

    /**
     * Set the stemEnglishPossessive property: A value indicating whether to remove trailing "'s" for each subword.
     * Default is true.
     *
     * @param stemEnglishPossessive the stemEnglishPossessive value to set.
     * @return the WordDelimiterTokenFilter object itself.
     */
    public WordDelimiterTokenFilter setStemEnglishPossessive(Boolean stemEnglishPossessive) {
        this.stemEnglishPossessive = stemEnglishPossessive;
        return this;
    }

    /**
     * Get the protectedWords property: A list of tokens to protect from being delimited.
     *
     * @return the protectedWords value.
     */
    public List<String> getProtectedWords() {
        return this.protectedWords;
    }

    /**
     * Set the protectedWords property: A list of tokens to protect from being delimited.
     *
     * @param protectedWords the protectedWords value to set.
     * @return the WordDelimiterTokenFilter object itself.
     */
    public WordDelimiterTokenFilter setProtectedWords(List<String> protectedWords) {
        this.protectedWords = protectedWords;
        return this;
    }
}