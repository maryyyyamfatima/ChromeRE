package com.google.android.libraries.elements.interfaces;

import defpackage.KR0;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ResourceCheck {
    final String buildLabel;
    final ArrayList resourceStatuses;

    public ResourceCheck(String str, ArrayList arrayList) {
        this.buildLabel = str;
        this.resourceStatuses = arrayList;
    }

    public String getBuildLabel() {
        return this.buildLabel;
    }

    public ArrayList getResourceStatuses() {
        return this.resourceStatuses;
    }

    public String toString() {
        return KR0.a("ResourceCheck{buildLabel=", this.buildLabel, ",resourceStatuses=", String.valueOf(this.resourceStatuses), "}");
    }
}
