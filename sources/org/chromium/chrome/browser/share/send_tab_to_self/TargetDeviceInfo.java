package org.chromium.chrome.browser.share.send_tab_to_self;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class TargetDeviceInfo {
    public final String a;
    public final int b;
    public final String c;
    public final long d;

    public TargetDeviceInfo(int i, String str, String str2, long j) {
        this.c = str;
        this.a = str2;
        this.b = i;
        this.d = j;
    }

    public static TargetDeviceInfo build(String str, String str2, int i, long j) {
        return new TargetDeviceInfo(i, str, str2, j);
    }
}
