package defpackage;

import android.accounts.Account;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Fj4 implements InterfaceC2739Vc {
    public final int b;
    public final int c;

    @Override // defpackage.InterfaceC2739Vc
    public final Account a() {
        return null;
    }

    public Fj4(Ej4 ej4) {
        this.b = ej4.a;
        this.c = ej4.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Fj4) {
            Fj4 fj4 = (Fj4) obj;
            if (W82.a(Integer.valueOf(this.b), Integer.valueOf(fj4.b)) && W82.a(Integer.valueOf(this.c), Integer.valueOf(fj4.c)) && W82.a(null, null)) {
                Boolean bool = Boolean.TRUE;
                if (W82.a(bool, bool)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), null, Boolean.TRUE});
    }
}
