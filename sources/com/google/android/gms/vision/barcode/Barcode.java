package com.google.android.gms.vision.barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.B7;
import defpackage.C0615Et;
import defpackage.C1393Ks2;
import defpackage.C2697Ut2;
import defpackage.C2980Wy0;
import defpackage.C3691au0;
import defpackage.C6311iY0;
import defpackage.C7040kf3;
import defpackage.C8901q34;
import defpackage.I40;
import defpackage.RE;
import defpackage.RT2;
import defpackage.SE;
import defpackage.Zo4;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class Barcode extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C0615Et();
    public final int a;
    public final String g;
    public final String h;
    public final int i;
    public final Point[] j;
    public final Email k;
    public final Phone l;
    public final Sms m;
    public final WiFi n;
    public final UrlBookmark o;
    public final GeoPoint p;
    public final CalendarEvent q;
    public final ContactInfo r;
    public final DriverLicense s;
    public final byte[] t;
    public final boolean u;
    public final double v;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class Address extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new B7();
        public final int a;
        public final String[] g;

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = RT2.a(20293, parcel);
            RT2.f(parcel, 2, 4);
            parcel.writeInt(this.a);
            RT2.p(parcel, 3, this.g);
            RT2.b(a, parcel);
        }

        public Address(int i, String[] strArr) {
            this.a = i;
            this.g = strArr;
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class CalendarDateTime extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new RE();
        public final int a;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final int k;
        public final boolean l;
        public final String m;

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = RT2.a(20293, parcel);
            RT2.f(parcel, 2, 4);
            parcel.writeInt(this.a);
            RT2.f(parcel, 3, 4);
            parcel.writeInt(this.g);
            RT2.f(parcel, 4, 4);
            parcel.writeInt(this.h);
            RT2.f(parcel, 5, 4);
            parcel.writeInt(this.i);
            RT2.f(parcel, 6, 4);
            parcel.writeInt(this.j);
            RT2.f(parcel, 7, 4);
            parcel.writeInt(this.k);
            RT2.f(parcel, 8, 4);
            parcel.writeInt(this.l ? 1 : 0);
            RT2.o(parcel, 9, this.m);
            RT2.b(a, parcel);
        }

        public CalendarDateTime(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
            this.a = i;
            this.g = i2;
            this.h = i3;
            this.i = i4;
            this.j = i5;
            this.k = i6;
            this.l = z;
            this.m = str;
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class CalendarEvent extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new SE();
        public final String a;
        public final String g;
        public final String h;
        public final String i;
        public final String j;
        public final CalendarDateTime k;
        public final CalendarDateTime l;

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = RT2.a(20293, parcel);
            RT2.o(parcel, 2, this.a);
            RT2.o(parcel, 3, this.g);
            RT2.o(parcel, 4, this.h);
            RT2.o(parcel, 5, this.i);
            RT2.o(parcel, 6, this.j);
            RT2.n(parcel, 7, this.k, i);
            RT2.n(parcel, 8, this.l, i);
            RT2.b(a, parcel);
        }

        public CalendarEvent(String str, String str2, String str3, String str4, String str5, CalendarDateTime calendarDateTime, CalendarDateTime calendarDateTime2) {
            this.a = str;
            this.g = str2;
            this.h = str3;
            this.i = str4;
            this.j = str5;
            this.k = calendarDateTime;
            this.l = calendarDateTime2;
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class ContactInfo extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new I40();
        public final PersonName a;
        public final String g;
        public final String h;
        public final Phone[] i;
        public final Email[] j;
        public final String[] k;
        public final Address[] l;

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = RT2.a(20293, parcel);
            RT2.n(parcel, 2, this.a, i);
            RT2.o(parcel, 3, this.g);
            RT2.o(parcel, 4, this.h);
            RT2.r(parcel, 5, this.i, i);
            RT2.r(parcel, 6, this.j, i);
            RT2.p(parcel, 7, this.k);
            RT2.r(parcel, 8, this.l, i);
            RT2.b(a, parcel);
        }

        public ContactInfo(PersonName personName, String str, String str2, Phone[] phoneArr, Email[] emailArr, String[] strArr, Address[] addressArr) {
            this.a = personName;
            this.g = str;
            this.h = str2;
            this.i = phoneArr;
            this.j = emailArr;
            this.k = strArr;
            this.l = addressArr;
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class DriverLicense extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new C3691au0();
        public final String a;
        public final String g;
        public final String h;
        public final String i;
        public final String j;
        public final String k;
        public final String l;
        public final String m;
        public final String n;
        public final String o;
        public final String p;
        public final String q;
        public final String r;
        public final String s;

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = RT2.a(20293, parcel);
            RT2.o(parcel, 2, this.a);
            RT2.o(parcel, 3, this.g);
            RT2.o(parcel, 4, this.h);
            RT2.o(parcel, 5, this.i);
            RT2.o(parcel, 6, this.j);
            RT2.o(parcel, 7, this.k);
            RT2.o(parcel, 8, this.l);
            RT2.o(parcel, 9, this.m);
            RT2.o(parcel, 10, this.n);
            RT2.o(parcel, 11, this.o);
            RT2.o(parcel, 12, this.p);
            RT2.o(parcel, 13, this.q);
            RT2.o(parcel, 14, this.r);
            RT2.o(parcel, 15, this.s);
            RT2.b(a, parcel);
        }

        public DriverLicense(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
            this.a = str;
            this.g = str2;
            this.h = str3;
            this.i = str4;
            this.j = str5;
            this.k = str6;
            this.l = str7;
            this.m = str8;
            this.n = str9;
            this.o = str10;
            this.p = str11;
            this.q = str12;
            this.r = str13;
            this.s = str14;
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class Email extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new C2980Wy0();
        public final int a;
        public final String g;
        public final String h;
        public final String i;

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = RT2.a(20293, parcel);
            RT2.f(parcel, 2, 4);
            parcel.writeInt(this.a);
            RT2.o(parcel, 3, this.g);
            RT2.o(parcel, 4, this.h);
            RT2.o(parcel, 5, this.i);
            RT2.b(a, parcel);
        }

        public Email(String str, int i, String str2, String str3) {
            this.a = i;
            this.g = str;
            this.h = str2;
            this.i = str3;
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class GeoPoint extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new C6311iY0();
        public final double a;
        public final double g;

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = RT2.a(20293, parcel);
            RT2.f(parcel, 2, 8);
            parcel.writeDouble(this.a);
            RT2.f(parcel, 3, 8);
            parcel.writeDouble(this.g);
            RT2.b(a, parcel);
        }

        public GeoPoint(double d, double d2) {
            this.a = d;
            this.g = d2;
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class PersonName extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new C1393Ks2();
        public final String a;
        public final String g;
        public final String h;
        public final String i;
        public final String j;
        public final String k;
        public final String l;

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = RT2.a(20293, parcel);
            RT2.o(parcel, 2, this.a);
            RT2.o(parcel, 3, this.g);
            RT2.o(parcel, 4, this.h);
            RT2.o(parcel, 5, this.i);
            RT2.o(parcel, 6, this.j);
            RT2.o(parcel, 7, this.k);
            RT2.o(parcel, 8, this.l);
            RT2.b(a, parcel);
        }

        public PersonName(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.a = str;
            this.g = str2;
            this.h = str3;
            this.i = str4;
            this.j = str5;
            this.k = str6;
            this.l = str7;
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class Phone extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new C2697Ut2();
        public final int a;
        public final String g;

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = RT2.a(20293, parcel);
            RT2.f(parcel, 2, 4);
            parcel.writeInt(this.a);
            RT2.o(parcel, 3, this.g);
            RT2.b(a, parcel);
        }

        public Phone(int i, String str) {
            this.a = i;
            this.g = str;
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class Sms extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new C7040kf3();
        public final String a;
        public final String g;

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = RT2.a(20293, parcel);
            RT2.o(parcel, 2, this.a);
            RT2.o(parcel, 3, this.g);
            RT2.b(a, parcel);
        }

        public Sms(String str, String str2) {
            this.a = str;
            this.g = str2;
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class UrlBookmark extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new C8901q34();
        public final String a;
        public final String g;

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = RT2.a(20293, parcel);
            RT2.o(parcel, 2, this.a);
            RT2.o(parcel, 3, this.g);
            RT2.b(a, parcel);
        }

        public UrlBookmark(String str, String str2) {
            this.a = str;
            this.g = str2;
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class WiFi extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new Zo4();
        public final String a;
        public final String g;
        public final int h;

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = RT2.a(20293, parcel);
            RT2.o(parcel, 2, this.a);
            RT2.o(parcel, 3, this.g);
            RT2.f(parcel, 4, 4);
            parcel.writeInt(this.h);
            RT2.b(a, parcel);
        }

        public WiFi(int i, String str, String str2) {
            this.a = str;
            this.g = str2;
            this.h = i;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.a);
        RT2.o(parcel, 3, this.g);
        RT2.o(parcel, 4, this.h);
        RT2.f(parcel, 5, 4);
        parcel.writeInt(this.i);
        RT2.r(parcel, 6, this.j, i);
        RT2.n(parcel, 7, this.k, i);
        RT2.n(parcel, 8, this.l, i);
        RT2.n(parcel, 9, this.m, i);
        RT2.n(parcel, 10, this.n, i);
        RT2.n(parcel, 11, this.o, i);
        RT2.n(parcel, 12, this.p, i);
        RT2.n(parcel, 13, this.q, i);
        RT2.n(parcel, 14, this.r, i);
        RT2.n(parcel, 15, this.s, i);
        RT2.d(parcel, 16, this.t);
        RT2.f(parcel, 17, 4);
        parcel.writeInt(this.u ? 1 : 0);
        RT2.f(parcel, 18, 8);
        parcel.writeDouble(this.v);
        RT2.b(a, parcel);
    }

    public Barcode(int i, String str, String str2, int i2, Point[] pointArr, Email email, Phone phone, Sms sms, WiFi wiFi, UrlBookmark urlBookmark, GeoPoint geoPoint, CalendarEvent calendarEvent, ContactInfo contactInfo, DriverLicense driverLicense, byte[] bArr, boolean z, double d) {
        this.a = i;
        this.g = str;
        this.t = bArr;
        this.h = str2;
        this.i = i2;
        this.j = pointArr;
        this.u = z;
        this.v = d;
        this.k = email;
        this.l = phone;
        this.m = sms;
        this.n = wiFi;
        this.o = urlBookmark;
        this.p = geoPoint;
        this.q = calendarEvent;
        this.r = contactInfo;
        this.s = driverLicense;
    }
}
