package com.google.android.gms.cast;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import defpackage.AJ3;
import defpackage.AbstractC3692au1;
import defpackage.RT2;
import defpackage.WH;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class TextTrackStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new AJ3();
    public float a;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public String n;
    public int o;
    public int p;
    public String q;
    public JSONObject r;

    public TextTrackStyle(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, int i8, int i9, String str2) {
        this.a = f;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.l = i6;
        this.m = i7;
        this.n = str;
        this.o = i8;
        this.p = i9;
        this.q = str2;
        if (str2 != null) {
            try {
                this.r = new JSONObject(this.q);
                return;
            } catch (JSONException unused) {
                this.r = null;
                this.q = null;
                return;
            }
        }
        this.r = null;
    }

    public TextTrackStyle() {
        this(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
    }

    public final JSONObject t1() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fontScale", this.a);
            int i = this.g;
            if (i != 0) {
                jSONObject.put("foregroundColor", s1(i));
            }
            int i2 = this.h;
            if (i2 != 0) {
                jSONObject.put("backgroundColor", s1(i2));
            }
            int i3 = this.i;
            if (i3 == 0) {
                jSONObject.put("edgeType", "NONE");
            } else if (i3 == 1) {
                jSONObject.put("edgeType", "OUTLINE");
            } else if (i3 == 2) {
                jSONObject.put("edgeType", "DROP_SHADOW");
            } else if (i3 == 3) {
                jSONObject.put("edgeType", "RAISED");
            } else if (i3 == 4) {
                jSONObject.put("edgeType", "DEPRESSED");
            }
            int i4 = this.j;
            if (i4 != 0) {
                jSONObject.put("edgeColor", s1(i4));
            }
            int i5 = this.k;
            if (i5 == 0) {
                jSONObject.put("windowType", "NONE");
            } else if (i5 == 1) {
                jSONObject.put("windowType", "NORMAL");
            } else if (i5 == 2) {
                jSONObject.put("windowType", "ROUNDED_CORNERS");
            }
            int i6 = this.l;
            if (i6 != 0) {
                jSONObject.put("windowColor", s1(i6));
            }
            if (this.k == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.m);
            }
            String str = this.n;
            if (str != null) {
                jSONObject.put("fontFamily", str);
            }
            switch (this.o) {
                case 0:
                    jSONObject.put("fontGenericFamily", "SANS_SERIF");
                    break;
                case 1:
                    jSONObject.put("fontGenericFamily", "MONOSPACED_SANS_SERIF");
                    break;
                case 2:
                    jSONObject.put("fontGenericFamily", "SERIF");
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    jSONObject.put("fontGenericFamily", "MONOSPACED_SERIF");
                    break;
                case 4:
                    jSONObject.put("fontGenericFamily", "CASUAL");
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    jSONObject.put("fontGenericFamily", "CURSIVE");
                    break;
                case 6:
                    jSONObject.put("fontGenericFamily", "SMALL_CAPITALS");
                    break;
            }
            int i7 = this.p;
            if (i7 == 0) {
                jSONObject.put("fontStyle", "NORMAL");
            } else if (i7 == 1) {
                jSONObject.put("fontStyle", "BOLD");
            } else if (i7 == 2) {
                jSONObject.put("fontStyle", "ITALIC");
            } else if (i7 == 3) {
                jSONObject.put("fontStyle", "BOLD_ITALIC");
            }
            JSONObject jSONObject2 = this.r;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static String s1(int i) {
        return String.format("#%02X%02X%02X%02X", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Integer.valueOf(Color.alpha(i)));
    }

    public static int r1(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextTrackStyle)) {
            return false;
        }
        TextTrackStyle textTrackStyle = (TextTrackStyle) obj;
        JSONObject jSONObject = this.r;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = textTrackStyle.r;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        if (jSONObject == null || jSONObject2 == null || AbstractC3692au1.a(jSONObject, jSONObject2)) {
            return this.a == textTrackStyle.a && this.g == textTrackStyle.g && this.h == textTrackStyle.h && this.i == textTrackStyle.i && this.j == textTrackStyle.j && this.k == textTrackStyle.k && this.l == textTrackStyle.l && this.m == textTrackStyle.m && WH.a(this.n, textTrackStyle.n) && this.o == textTrackStyle.o && this.p == textTrackStyle.p;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i), Integer.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l), Integer.valueOf(this.m), this.n, Integer.valueOf(this.o), Integer.valueOf(this.p), String.valueOf(this.r)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.r;
        this.q = jSONObject == null ? null : jSONObject.toString();
        int a = RT2.a(20293, parcel);
        float f = this.a;
        RT2.f(parcel, 2, 4);
        parcel.writeFloat(f);
        int i2 = this.g;
        RT2.f(parcel, 3, 4);
        parcel.writeInt(i2);
        int i3 = this.h;
        RT2.f(parcel, 4, 4);
        parcel.writeInt(i3);
        int i4 = this.i;
        RT2.f(parcel, 5, 4);
        parcel.writeInt(i4);
        int i5 = this.j;
        RT2.f(parcel, 6, 4);
        parcel.writeInt(i5);
        int i6 = this.k;
        RT2.f(parcel, 7, 4);
        parcel.writeInt(i6);
        int i7 = this.l;
        RT2.f(parcel, 8, 4);
        parcel.writeInt(i7);
        int i8 = this.m;
        RT2.f(parcel, 9, 4);
        parcel.writeInt(i8);
        RT2.o(parcel, 10, this.n);
        int i9 = this.o;
        RT2.f(parcel, 11, 4);
        parcel.writeInt(i9);
        int i10 = this.p;
        RT2.f(parcel, 12, 4);
        parcel.writeInt(i10);
        RT2.o(parcel, 13, this.q);
        RT2.b(a, parcel);
    }
}
