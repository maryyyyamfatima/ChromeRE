package org.chromium.content.browser;

import defpackage.AY3;
import defpackage.GY3;
import defpackage.HY3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TtsPlatformImpl {
    public long a;
    public final GY3 b;
    public final HashMap c;

    public final boolean isInitialized() {
        return this.b.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean speak(int r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, float r18, float r19, float r20) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.content.browser.TtsPlatformImpl.speak(int, java.lang.String, java.lang.String, java.lang.String, float, float, float):boolean");
    }

    public final void stop() {
        GY3 gy3 = this.b;
        if (gy3.c) {
            gy3.a.stop();
        }
        if (gy3.e != null) {
            gy3.e = null;
        }
        Iterator it = this.c.entrySet().iterator();
        while (it.hasNext()) {
            GY3 gy32 = (GY3) ((Map.Entry) it.next()).getValue();
            if (gy32.c) {
                gy32.a.stop();
            }
            if (gy32.e != null) {
                gy32.e = null;
            }
        }
    }

    public final int getVoiceCount() {
        return this.b.b.size();
    }

    public final String getVoiceLanguage(int i) {
        return ((HY3) this.b.b.get(i)).b;
    }

    public final String getVoiceName(int i) {
        return ((HY3) this.b.b.get(i)).a;
    }

    public TtsPlatformImpl(long j) {
        this.a = j;
        GY3 gy3 = new GY3(j);
        this.b = gy3;
        this.c = new HashMap();
        gy3.a.setOnUtteranceProgressListener(new AY3(this));
    }

    public static TtsPlatformImpl create(long j) {
        return new TtsPlatformImpl(j);
    }

    public final void destroy() {
        this.a = 0L;
    }
}
