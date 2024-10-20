package com.google.android.libraries.elements.interfaces;

import defpackage.KR0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ResourceEntry {
    final byte[] resourceBytes;
    final ResourceMetadata resourceMetadata;

    public ResourceEntry(ResourceMetadata resourceMetadata, byte[] bArr) {
        this.resourceMetadata = resourceMetadata;
        this.resourceBytes = bArr;
    }

    public ResourceMetadata getResourceMetadata() {
        return this.resourceMetadata;
    }

    public byte[] getResourceBytes() {
        return this.resourceBytes;
    }

    public String toString() {
        return KR0.a("ResourceEntry{resourceMetadata=", String.valueOf(this.resourceMetadata), ",resourceBytes=", String.valueOf(this.resourceBytes), "}");
    }
}
