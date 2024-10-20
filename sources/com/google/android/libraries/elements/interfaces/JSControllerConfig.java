package com.google.android.libraries.elements.interfaces;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JSControllerConfig {
    public static final int DEFAULT_VM_CONTEXT_LRU_SIZE = 5;
    final boolean enableDedicatedJsVmThread;
    final boolean enableVmContextLru;
    final JSControllerInitializationMode initializationMode;
    final int jsEngineSelection;
    final boolean shouldLockVmIsolate;
    final boolean shouldUseDirectJsObjectCreation;
    final boolean skipLegacyFunctionBindings;
    final int vmContextLruSize;

    public JSControllerConfig(JSControllerInitializationMode jSControllerInitializationMode, boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, int i2) {
        this.initializationMode = jSControllerInitializationMode;
        this.enableVmContextLru = z;
        this.vmContextLruSize = i;
        this.shouldLockVmIsolate = z2;
        this.shouldUseDirectJsObjectCreation = z3;
        this.skipLegacyFunctionBindings = z4;
        this.enableDedicatedJsVmThread = z5;
        this.jsEngineSelection = i2;
    }

    public JSControllerInitializationMode getInitializationMode() {
        return this.initializationMode;
    }

    public boolean getEnableVmContextLru() {
        return this.enableVmContextLru;
    }

    public int getVmContextLruSize() {
        return this.vmContextLruSize;
    }

    public boolean getShouldLockVmIsolate() {
        return this.shouldLockVmIsolate;
    }

    public boolean getShouldUseDirectJsObjectCreation() {
        return this.shouldUseDirectJsObjectCreation;
    }

    public boolean getSkipLegacyFunctionBindings() {
        return this.skipLegacyFunctionBindings;
    }

    public boolean getEnableDedicatedJsVmThread() {
        return this.enableDedicatedJsVmThread;
    }

    public int getJsEngineSelection() {
        return this.jsEngineSelection;
    }

    public String toString() {
        return "JSControllerConfig{initializationMode=" + String.valueOf(this.initializationMode) + ",enableVmContextLru=" + this.enableVmContextLru + ",vmContextLruSize=" + this.vmContextLruSize + ",shouldLockVmIsolate=" + this.shouldLockVmIsolate + ",shouldUseDirectJsObjectCreation=" + this.shouldUseDirectJsObjectCreation + ",skipLegacyFunctionBindings=" + this.skipLegacyFunctionBindings + ",enableDedicatedJsVmThread=" + this.enableDedicatedJsVmThread + ",jsEngineSelection=" + this.jsEngineSelection + "}";
    }
}
