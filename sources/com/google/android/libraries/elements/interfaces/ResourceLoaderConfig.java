package com.google.android.libraries.elements.interfaces;

import defpackage.AbstractC9972tB0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ResourceLoaderConfig {
    final String bytesPath;
    final Long cacheCap;
    final Long cacheExpirationBuffer;
    final Boolean enforceDependencyOrdering;
    final Integer maxBuildLabels;
    final Integer maxTags;
    final String metadataPath;

    public ResourceLoaderConfig(Integer num, Integer num2, String str, String str2, Long l, Long l2, Boolean bool) {
        this.maxTags = num;
        this.maxBuildLabels = num2;
        this.bytesPath = str;
        this.metadataPath = str2;
        this.cacheCap = l;
        this.cacheExpirationBuffer = l2;
        this.enforceDependencyOrdering = bool;
    }

    public Integer getMaxTags() {
        return this.maxTags;
    }

    public Integer getMaxBuildLabels() {
        return this.maxBuildLabels;
    }

    public String getBytesPath() {
        return this.bytesPath;
    }

    public String getMetadataPath() {
        return this.metadataPath;
    }

    public Long getCacheCap() {
        return this.cacheCap;
    }

    public Long getCacheExpirationBuffer() {
        return this.cacheExpirationBuffer;
    }

    public Boolean getEnforceDependencyOrdering() {
        return this.enforceDependencyOrdering;
    }

    public String toString() {
        Integer num = this.maxTags;
        Integer num2 = this.maxBuildLabels;
        String str = this.bytesPath;
        String str2 = this.metadataPath;
        Long l = this.cacheCap;
        Long l2 = this.cacheExpirationBuffer;
        Boolean bool = this.enforceDependencyOrdering;
        StringBuilder sb = new StringBuilder("ResourceLoaderConfig{maxTags=");
        sb.append(num);
        sb.append(",maxBuildLabels=");
        sb.append(num2);
        sb.append(",bytesPath=");
        AbstractC9972tB0.a(sb, str, ",metadataPath=", str2, ",cacheCap=");
        sb.append(l);
        sb.append(",cacheExpirationBuffer=");
        sb.append(l2);
        sb.append(",enforceDependencyOrdering=");
        sb.append(bool);
        sb.append("}");
        return sb.toString();
    }
}
