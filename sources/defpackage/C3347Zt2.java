package defpackage;

import android.net.Uri;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zt2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3347Zt2 implements InterfaceC4037bu2 {
    public final InterfaceC4037bu2 a;
    public boolean g;

    public C3347Zt2(InterfaceC4037bu2 interfaceC4037bu2) {
        this.a = interfaceC4037bu2;
    }

    @Override // defpackage.InterfaceC4037bu2
    public final void a(int i, Uri[] uriArr) {
        this.g = false;
        if (i == 3 || i == 2) {
            this.g = true;
        }
        this.a.a(i, uriArr);
    }

    @Override // defpackage.InterfaceC4037bu2
    public final void c() {
        this.a.c();
    }
}
