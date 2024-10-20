package defpackage;

import android.content.ClipData;
import android.view.ContentInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: t50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9937t50 implements InterfaceC10280u50 {
    public final ContentInfo a;

    public C9937t50(ContentInfo contentInfo) {
        this.a = contentInfo;
    }

    @Override // defpackage.InterfaceC10280u50
    public final ContentInfo i() {
        return this.a;
    }

    @Override // defpackage.InterfaceC10280u50
    public final ClipData h() {
        ClipData clip;
        clip = this.a.getClip();
        return clip;
    }

    @Override // defpackage.InterfaceC10280u50
    public final int j() {
        int source;
        source = this.a.getSource();
        return source;
    }

    @Override // defpackage.InterfaceC10280u50
    public final int g() {
        int flags;
        flags = this.a.getFlags();
        return flags;
    }

    public final String toString() {
        return "ContentInfoCompat{" + this.a + "}";
    }
}
