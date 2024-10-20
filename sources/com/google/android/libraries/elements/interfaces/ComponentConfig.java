package com.google.android.libraries.elements.interfaces;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ComponentConfig {
    final int materializationBloatMs;
    final boolean reuseEntitiesProcessors;
    final boolean useEkoCanaryChannel;
    final boolean useEntitiesProcessorMap;

    public ComponentConfig(boolean z, int i, boolean z2, boolean z3) {
        this.useEkoCanaryChannel = z;
        this.materializationBloatMs = i;
        this.reuseEntitiesProcessors = z2;
        this.useEntitiesProcessorMap = z3;
    }

    public boolean getUseEkoCanaryChannel() {
        return this.useEkoCanaryChannel;
    }

    public int getMaterializationBloatMs() {
        return this.materializationBloatMs;
    }

    public boolean getReuseEntitiesProcessors() {
        return this.reuseEntitiesProcessors;
    }

    public boolean getUseEntitiesProcessorMap() {
        return this.useEntitiesProcessorMap;
    }

    public String toString() {
        return "ComponentConfig{useEkoCanaryChannel=" + this.useEkoCanaryChannel + ",materializationBloatMs=" + this.materializationBloatMs + ",reuseEntitiesProcessors=" + this.reuseEntitiesProcessors + ",useEntitiesProcessorMap=" + this.useEntitiesProcessorMap + "}";
    }
}
