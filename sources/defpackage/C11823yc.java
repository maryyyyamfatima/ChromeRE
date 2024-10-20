package defpackage;

import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$Source;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yc */
/* loaded from: classes.dex */
public final class C11823yc {
    public final List a;
    public final C3492aK1 b;

    public C11823yc(ArrayList arrayList, C3492aK1 c3492aK1) {
        this.a = arrayList;
        this.b = c3492aK1;
    }

    public static C10794vc a(ImageDecoder$Source imageDecoder$Source, int i, int i2, C0543Ee2 c0543Ee2) {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(imageDecoder$Source, new C7411lk0(i, i2, c0543Ee2));
        if (!(decodeDrawable instanceof AnimatedImageDrawable)) {
            throw new IOException("Received unexpected drawable type for animated webp, failing: ".concat(String.valueOf(decodeDrawable)));
        }
        return new C10794vc((AnimatedImageDrawable) decodeDrawable);
    }
}
