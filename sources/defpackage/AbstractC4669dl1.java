package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.Thing;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dl1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4669dl1 {
    public final Bundle a = new Bundle();
    public final String b;
    public Thing.Metadata c;
    public String d;

    public AbstractC4669dl1(String str) {
        this.b = str;
    }

    public final Thing a() {
        Bundle bundle = new Bundle(this.a);
        Thing.Metadata metadata = this.c;
        if (metadata == null) {
            C9009qO0 c9009qO0 = C9009qO0.n;
            metadata = new Thing.Metadata(c9009qO0.k, c9009qO0.l, c9009qO0.m, new Bundle(), null);
        }
        return new Thing(bundle, metadata, this.d, this.b);
    }

    public final void c(String str, String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < Math.min(strArr2.length, 100); i2++) {
                String str2 = strArr2[i2];
                strArr2[i] = str2;
                if (strArr2[i2] != null) {
                    int i3 = 20000;
                    if (str2.length() > 20000) {
                        String str3 = strArr2[i];
                        if (str3.length() > 20000) {
                            if (Character.isHighSurrogate(str3.charAt(19999)) && Character.isLowSurrogate(str3.charAt(20000))) {
                                i3 = 19999;
                            }
                            str3 = str3.substring(0, i3);
                        }
                        strArr2[i] = str3;
                    }
                    i++;
                }
            }
            if (i > 0) {
                Object[] objArr = (String[]) Arrays.copyOfRange(strArr2, 0, i);
                if (objArr.length >= 100) {
                    objArr = Arrays.copyOf(objArr, 100);
                }
                this.a.putStringArray(str, (String[]) objArr);
            }
        }
    }

    public final void b(String str, InterfaceC4325cl1... interfaceC4325cl1Arr) {
        int length = interfaceC4325cl1Arr.length;
        Thing[] thingArr = new Thing[length];
        for (int i = 0; i < interfaceC4325cl1Arr.length; i++) {
            InterfaceC4325cl1 interfaceC4325cl1 = interfaceC4325cl1Arr[i];
            if (interfaceC4325cl1 != null && !(interfaceC4325cl1 instanceof Thing)) {
                throw new C10380uO0("Invalid Indexable encountered. Use Indexable.Builder or convenience methods under Indexables to create the Indexable.");
            }
            thingArr[i] = (Thing) interfaceC4325cl1;
        }
        if (length > 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                thingArr[i2] = thingArr[i3];
                if (thingArr[i3] != null) {
                    i2++;
                }
            }
            if (i2 > 0) {
                Object[] objArr = (Thing[]) Arrays.copyOfRange(thingArr, 0, i2);
                if (objArr.length >= 100) {
                    objArr = Arrays.copyOf(objArr, 100);
                }
                this.a.putParcelableArray(str, (Parcelable[]) objArr);
            }
        }
    }
}
