package com.google.android.libraries.elements.interfaces;

import defpackage.AbstractC9972tB0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JsPerformanceEventInfo {
    final Integer bindingExtensionId;
    final String functionName;
    final long identifier;
    final boolean isSynchronous;
    final String moduleIdentifier;
    final int statusCode;
    final String statusMessage;

    public JsPerformanceEventInfo(long j, int i, String str, String str2, String str3, boolean z, Integer num) {
        this.identifier = j;
        this.statusCode = i;
        this.statusMessage = str;
        this.moduleIdentifier = str2;
        this.functionName = str3;
        this.isSynchronous = z;
        this.bindingExtensionId = num;
    }

    public long getIdentifier() {
        return this.identifier;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public String getModuleIdentifier() {
        return this.moduleIdentifier;
    }

    public String getFunctionName() {
        return this.functionName;
    }

    public boolean getIsSynchronous() {
        return this.isSynchronous;
    }

    public Integer getBindingExtensionId() {
        return this.bindingExtensionId;
    }

    public String toString() {
        long j = this.identifier;
        int i = this.statusCode;
        String str = this.statusMessage;
        String str2 = this.moduleIdentifier;
        String str3 = this.functionName;
        boolean z = this.isSynchronous;
        Integer num = this.bindingExtensionId;
        StringBuilder sb = new StringBuilder("JsPerformanceEventInfo{identifier=");
        sb.append(j);
        sb.append(",statusCode=");
        sb.append(i);
        AbstractC9972tB0.a(sb, ",statusMessage=", str, ",moduleIdentifier=", str2);
        sb.append(",functionName=");
        sb.append(str3);
        sb.append(",isSynchronous=");
        sb.append(z);
        sb.append(",bindingExtensionId=");
        sb.append(num);
        sb.append("}");
        return sb.toString();
    }
}
