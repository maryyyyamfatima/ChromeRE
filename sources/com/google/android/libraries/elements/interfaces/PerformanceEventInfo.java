package com.google.android.libraries.elements.interfaces;

import defpackage.AbstractC10975w63;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PerformanceEventInfo {
    final Long commandExtensionId;
    final JsPerformanceEventInfo jsPerformanceEventInfo;
    final Integer materializationCount;
    final Integer measurementCount;
    final String nodeIdentifier;
    final String templateUri;

    public PerformanceEventInfo(String str, String str2, Integer num, Integer num2, Long l, JsPerformanceEventInfo jsPerformanceEventInfo) {
        this.templateUri = str;
        this.nodeIdentifier = str2;
        this.materializationCount = num;
        this.measurementCount = num2;
        this.commandExtensionId = l;
        this.jsPerformanceEventInfo = jsPerformanceEventInfo;
    }

    public String getTemplateUri() {
        return this.templateUri;
    }

    public String getNodeIdentifier() {
        return this.nodeIdentifier;
    }

    public Integer getMaterializationCount() {
        return this.materializationCount;
    }

    public Integer getMeasurementCount() {
        return this.measurementCount;
    }

    public Long getCommandExtensionId() {
        return this.commandExtensionId;
    }

    public JsPerformanceEventInfo getJsPerformanceEventInfo() {
        return this.jsPerformanceEventInfo;
    }

    public String toString() {
        String str = this.templateUri;
        String str2 = this.nodeIdentifier;
        Integer num = this.materializationCount;
        Integer num2 = this.measurementCount;
        Long l = this.commandExtensionId;
        String valueOf = String.valueOf(this.jsPerformanceEventInfo);
        StringBuilder a = AbstractC10975w63.a("PerformanceEventInfo{templateUri=", str, ",nodeIdentifier=", str2, ",materializationCount=");
        a.append(num);
        a.append(",measurementCount=");
        a.append(num2);
        a.append(",commandExtensionId=");
        a.append(l);
        a.append(",jsPerformanceEventInfo=");
        a.append(valueOf);
        a.append("}");
        return a.toString();
    }
}
