package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7768mm1 implements InterfaceC8456om1 {
    public final InputContentInfo a;

    public C7768mm1(Object obj) {
        this.a = (InputContentInfo) obj;
    }

    public C7768mm1(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // defpackage.InterfaceC8456om1
    public final Uri a() {
        Uri contentUri;
        contentUri = this.a.getContentUri();
        return contentUri;
    }

    @Override // defpackage.InterfaceC8456om1
    public final ClipDescription d() {
        ClipDescription description;
        description = this.a.getDescription();
        return description;
    }

    @Override // defpackage.InterfaceC8456om1
    public final Uri c() {
        Uri linkUri;
        linkUri = this.a.getLinkUri();
        return linkUri;
    }

    @Override // defpackage.InterfaceC8456om1
    public final Object e() {
        return this.a;
    }

    @Override // defpackage.InterfaceC8456om1
    public final void b() {
        this.a.requestPermission();
    }
}
