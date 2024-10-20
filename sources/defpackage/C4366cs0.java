package defpackage;

import J.N;
import android.os.Build;
import org.chromium.base.ContentUriUtils;
import org.chromium.chrome.browser.download.DownloadManagerBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cs0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4366cs0 extends AbstractC0185Bl {
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ String j;
    public final /* synthetic */ String k;
    public final /* synthetic */ long l;
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;
    public final /* synthetic */ String o;
    public final /* synthetic */ long p;

    public C4366cs0(String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, long j2) {
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.k = str4;
        this.l = j;
        this.m = str5;
        this.n = str6;
        this.o = str7;
        this.p = j2;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        N.Mct0JWyi(this.p, ((Long) obj).longValue());
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        return Long.valueOf((ContentUriUtils.e(this.h) || Build.VERSION.SDK_INT >= 29) ? -1L : DownloadManagerBridge.a(this.i, this.j, this.k, this.h, this.l, this.m, this.n, this.o));
    }
}
