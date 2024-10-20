package org.chromium.chrome.browser.historyreport;

import defpackage.Y5;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DeltaFileEntry {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;

    public DeltaFileEntry(long j, String str, String str2, String str3, int i, String str4, String str5) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = str4;
        this.g = str5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeltaFileEntry[");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", ");
        return Y5.a(sb, this.f, "]");
    }
}
