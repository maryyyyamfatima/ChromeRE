package defpackage;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5431fy implements InterfaceC11073wP2 {
    public final Bitmap.CompressFormat a = Bitmap.CompressFormat.JPEG;
    public final int b = 100;

    @Override // defpackage.InterfaceC11073wP2
    public final JO2 a(JO2 jo2, C0543Ee2 c0543Ee2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) jo2.get()).compress(this.a, this.b, byteArrayOutputStream);
        jo2.b();
        return new C4491dE(byteArrayOutputStream.toByteArray());
    }
}
