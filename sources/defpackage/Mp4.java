package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class Mp4 extends Jp4 {
    public Mp4(C5389fq4 c5389fq4, WindowInsets windowInsets) {
        super(c5389fq4, windowInsets);
    }

    @Override // defpackage.Up4
    public final C3065Xp0 e() {
        DisplayCutout displayCutout;
        displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C3065Xp0(displayCutout);
    }

    @Override // defpackage.Up4
    public final C5389fq4 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.c.consumeDisplayCutout();
        return C5389fq4.g(null, consumeDisplayCutout);
    }

    @Override // defpackage.Ip4, defpackage.Up4
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mp4)) {
            return false;
        }
        Mp4 mp4 = (Mp4) obj;
        return Objects.equals(this.c, mp4.c) && Objects.equals(this.g, mp4.g);
    }

    @Override // defpackage.Up4
    public final int hashCode() {
        return this.c.hashCode();
    }
}
