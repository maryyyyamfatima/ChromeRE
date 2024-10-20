package defpackage;

import android.content.ClipDescription;
import android.net.Uri;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8112nm1 implements InterfaceC8456om1 {
    public final Uri a;
    public final ClipDescription b;
    public final Uri c;

    @Override // defpackage.InterfaceC8456om1
    public final void b() {
    }

    @Override // defpackage.InterfaceC8456om1
    public final Object e() {
        return null;
    }

    public C8112nm1(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = uri;
        this.b = clipDescription;
        this.c = uri2;
    }

    @Override // defpackage.InterfaceC8456om1
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.InterfaceC8456om1
    public final ClipDescription d() {
        return this.b;
    }

    @Override // defpackage.InterfaceC8456om1
    public final Uri c() {
        return this.c;
    }
}
