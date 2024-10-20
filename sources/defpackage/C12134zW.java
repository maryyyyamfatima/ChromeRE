package defpackage;

import J.N;
import org.chromium.components.embedder_support.delegate.ColorChooserAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zW, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C12134zW implements InterfaceC1183Jc2 {
    public final /* synthetic */ ColorChooserAndroid a;

    @Override // defpackage.InterfaceC1183Jc2
    public final void a(int i) {
        ColorChooserAndroid colorChooserAndroid = this.a;
        colorChooserAndroid.a.dismiss();
        N.M2zph6xH(colorChooserAndroid.b, colorChooserAndroid, i);
    }

    public C12134zW(ColorChooserAndroid colorChooserAndroid) {
        this.a = colorChooserAndroid;
    }
}
