package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ye0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3140Ye0 {
    public ArrayList c;
    public final Intent a = new Intent("android.intent.action.VIEW");
    public final C9429rd0 b = new C9429rd0();
    public int d = 0;
    public final boolean e = true;

    public final void d() {
        this.a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
    }

    public final void c(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("Invalid value for the shareState argument");
        }
        this.d = i;
        Intent intent = this.a;
        if (i == 1) {
            intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
        } else if (i == 2) {
            intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
        } else {
            intent.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
        }
    }

    public final void b(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("Invalid value for the colorScheme argument");
        }
        this.a.putExtra("androidx.browser.customtabs.extra.COLOR_SCHEME", i);
    }

    public final C3270Ze0 a() {
        Intent intent = this.a;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        ArrayList<? extends Parcelable> arrayList = this.c;
        if (arrayList != null) {
            intent.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.e);
        Integer num = this.b.a;
        Bundle bundle2 = new Bundle();
        if (num != null) {
            bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        intent.putExtras(bundle2);
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.d);
        return new C3270Ze0(intent);
    }
}
