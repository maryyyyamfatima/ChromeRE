package com.google.android.libraries.elements.interfaces;

import defpackage.AbstractC10975w63;
import defpackage.Y5;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ResourceMetadata {
    final ArrayList dependencies;
    final String resourceIdentifier;
    final Long resourceTag;
    final ResourceType resourceType;
    final String securityVerifier;

    public ResourceMetadata(String str, ResourceType resourceType, Long l, ArrayList arrayList, String str2) {
        this.resourceIdentifier = str;
        this.resourceType = resourceType;
        this.resourceTag = l;
        this.dependencies = arrayList;
        this.securityVerifier = str2;
    }

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    public ResourceType getResourceType() {
        return this.resourceType;
    }

    public Long getResourceTag() {
        return this.resourceTag;
    }

    public ArrayList getDependencies() {
        return this.dependencies;
    }

    public String getSecurityVerifier() {
        return this.securityVerifier;
    }

    public String toString() {
        String str = this.resourceIdentifier;
        String valueOf = String.valueOf(this.resourceType);
        Long l = this.resourceTag;
        String valueOf2 = String.valueOf(this.dependencies);
        String str2 = this.securityVerifier;
        StringBuilder a = AbstractC10975w63.a("ResourceMetadata{resourceIdentifier=", str, ",resourceType=", valueOf, ",resourceTag=");
        a.append(l);
        a.append(",dependencies=");
        a.append(valueOf2);
        a.append(",securityVerifier=");
        return Y5.a(a, str2, "}");
    }
}
