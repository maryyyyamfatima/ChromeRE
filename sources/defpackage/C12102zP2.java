package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zP2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12102zP2 {
    public final ColorStateList a;
    public final Configuration b;
    public final int c;

    public C12102zP2(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.a = colorStateList;
        this.b = configuration;
        this.c = theme == null ? 0 : theme.hashCode();
    }
}
