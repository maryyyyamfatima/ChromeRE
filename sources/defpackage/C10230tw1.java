package defpackage;

import android.text.TextUtils;
import com.android.chrome.R;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import org.chromium.ui.base.ResourceBundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tw1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10230tw1 {
    public static final C9887sw1 f = new Comparator() { // from class: sw1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((C10230tw1) obj).b.compareTo(((C10230tw1) obj2).b);
        }
    };
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public C10230tw1(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        boolean z2 = true;
        if (!TextUtils.equals(str, null) && Arrays.binarySearch(ResourceBundle.a, str, null) < 0) {
            z2 = false;
        }
        this.e = z2;
    }

    public static C10230tw1 a() {
        return new C10230tw1(null, V60.a.getResources().getString(R.string.f72010_resource_name_obfuscated_res_0x7f1403eb), C6132i01.d.a.getDisplayName(Locale.getDefault()), true);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10230tw1) {
            return TextUtils.equals(this.a, ((C10230tw1) obj).a);
        }
        return false;
    }
}
