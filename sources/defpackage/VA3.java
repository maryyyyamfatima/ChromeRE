package defpackage;

import java.util.AbstractList;
import java.util.Collections;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class VA3 {
    public final List a;
    public final int b;

    public VA3(int i, AbstractList abstractList) {
        this.a = Collections.unmodifiableList(abstractList);
        this.b = i;
    }
}
