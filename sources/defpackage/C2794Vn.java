package defpackage;

import android.view.View;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2794Vn {
    public View a;
    public View b;
    public C1629Mo c;
    public final Object d;
    public SenderStateOuterClass$SenderState e;
    public InterfaceC8177nx0 f;
    public final String g;
    public C3998bo h;
    public U80 i;

    public C2794Vn() {
    }

    public C2794Vn(AbstractC9053qX abstractC9053qX) {
        C2924Wn c2924Wn = (C2924Wn) abstractC9053qX;
        this.a = c2924Wn.a;
        this.b = c2924Wn.b;
        this.c = c2924Wn.c;
        this.d = c2924Wn.d;
        this.e = c2924Wn.e;
        this.f = c2924Wn.f;
        this.g = c2924Wn.g;
        this.h = c2924Wn.h;
        this.i = c2924Wn.i;
    }

    public final void b(U80 u80) {
        if (u80 == null) {
            throw new NullPointerException("Null conversionContext");
        }
        this.i = u80;
    }

    public final C2924Wn a() {
        U80 u80 = this.i;
        if (u80 == null) {
            throw new IllegalStateException("Missing required properties: conversionContext");
        }
        return new C2924Wn(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, u80);
    }
}
