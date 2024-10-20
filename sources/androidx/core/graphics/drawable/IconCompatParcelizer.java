package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import defpackage.F84;
import defpackage.G84;
import java.nio.charset.Charset;

/* JADX WARN: Classes with same name are omitted:
  assets/webapk8.dex
 */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(F84 f84) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = f84.f(iconCompat.a, 1);
        byte[] bArr = iconCompat.c;
        if (f84.e(2)) {
            Parcel parcel = ((G84) f84).e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.d = f84.g(iconCompat.d, 3);
        iconCompat.e = f84.f(iconCompat.e, 4);
        iconCompat.f = f84.f(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) f84.g(iconCompat.g, 6);
        String str = iconCompat.i;
        if (f84.e(7)) {
            str = ((G84) f84).e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.j;
        if (f84.e(8)) {
            str2 = ((G84) f84).e.readString();
        }
        iconCompat.j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    return iconCompat;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return iconCompat;
            case 1:
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.c;
                    iconCompat.b = bArr3;
                    iconCompat.a = 3;
                    iconCompat.e = 0;
                    iconCompat.f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str3;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, F84 f84) {
        f84.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            f84.j(i, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            f84.i(2);
            int length = bArr.length;
            Parcel parcel = ((G84) f84).e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            f84.k(parcelable, 3);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            f84.j(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            f84.j(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            f84.k(colorStateList, 6);
        }
        String str = iconCompat.i;
        if (str != null) {
            f84.i(7);
            ((G84) f84).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            f84.i(8);
            ((G84) f84).e.writeString(str2);
        }
    }
}
