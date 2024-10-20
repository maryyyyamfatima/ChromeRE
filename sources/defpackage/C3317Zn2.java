package defpackage;

import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zn2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3317Zn2 {
    public final ArrayList a = new ArrayList();

    public C3317Zn2(String str) {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!z && charAt == '\\') {
                z = true;
            } else if (!z && charAt == '*') {
                this.a.add(sb.toString());
                sb = new StringBuilder();
            } else {
                sb.append(charAt);
                z = false;
            }
        }
        if (z) {
            throw new C3187Yn2(str);
        }
        this.a.add(sb.toString());
    }
}
