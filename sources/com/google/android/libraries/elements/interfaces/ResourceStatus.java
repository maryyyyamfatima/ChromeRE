package com.google.android.libraries.elements.interfaces;

import defpackage.KR0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ResourceStatus {
    final String identifier;
    final StatusInResponse status;

    public ResourceStatus(String str, StatusInResponse statusInResponse) {
        this.identifier = str;
        this.status = statusInResponse;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public StatusInResponse getStatus() {
        return this.status;
    }

    public String toString() {
        return KR0.a("ResourceStatus{identifier=", this.identifier, ",status=", String.valueOf(this.status), "}");
    }
}
