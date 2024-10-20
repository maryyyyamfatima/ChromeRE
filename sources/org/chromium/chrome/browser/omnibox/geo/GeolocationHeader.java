package org.chromium.chrome.browser.omnibox.geo;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.Base64;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC7341lY0;
import defpackage.AbstractC9048qW;
import defpackage.AbstractC9076qb1;
import defpackage.AbstractC9771sd;
import defpackage.Bf4;
import defpackage.C11503xf4;
import defpackage.C11846yf4;
import defpackage.C12189zf4;
import defpackage.C1997Pj2;
import defpackage.C2127Qj2;
import defpackage.C2257Rj2;
import defpackage.C2387Sj2;
import defpackage.C6997kY0;
import defpackage.EI2;
import defpackage.V60;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import org.chromium.base.ThreadUtils;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.search_engines.TemplateUrlService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class GeolocationHeader {
    public static long a = Long.MAX_VALUE;

    public static void f(Profile profile, TemplateUrlService templateUrlService) {
        LocationManager locationManager;
        Location lastKnownLocation;
        if (profile != null && hasGeolocationPermission()) {
            if (c(profile, templateUrlService.d("some_query", null), false) == 0) {
                if (a == Long.MAX_VALUE) {
                    a = SystemClock.elapsedRealtime();
                }
                Context context = V60.a;
                Object obj = ThreadUtils.a;
                if (AbstractC7341lY0.c(context, "android.permission.ACCESS_COARSE_LOCATION") && AbstractC7341lY0.a == null && (((lastKnownLocation = (locationManager = (LocationManager) context.getSystemService("location")).getLastKnownLocation("network")) == null || AbstractC7341lY0.b(lastKnownLocation) > 300000) && locationManager.isProviderEnabled("network"))) {
                    C6997kY0 c6997kY0 = new C6997kY0(locationManager);
                    AbstractC7341lY0.a = c6997kY0;
                    try {
                        locationManager.requestSingleUpdate("network", c6997kY0, (Looper) null);
                    } catch (NullPointerException unused) {
                        AbstractC7341lY0.a.d = true;
                    }
                }
                Bf4.b(V60.a);
            }
        }
    }

    public static String getGeoHeader(String str, Profile profile) {
        if (profile == null) {
            return null;
        }
        return d(str, profile, null);
    }

    public static boolean hasGeolocationPermission() {
        return AbstractC9771sd.a(Process.myPid(), Process.myUid(), V60.a, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(org.chromium.chrome.browser.profiles.Profile r8, java.lang.String r9, boolean r10) {
        /*
            r0 = 0
            java.lang.String r1 = "GeolocationHeader.geoHeaderStateForUrl"
            org.chromium.base.TraceEvent r0 = org.chromium.base.TraceEvent.i(r1, r0)
            boolean r1 = r8.i()     // Catch: java.lang.Throwable -> L93
            r2 = 1
            if (r1 == 0) goto L14
            if (r0 == 0) goto L13
            r0.close()
        L13:
            return r2
        L14:
            boolean r1 = J.N.M$l72hrq(r9)     // Catch: java.lang.Throwable -> L93
            if (r1 != 0) goto L21
            if (r0 == 0) goto L1f
            r0.close()
        L1f:
            r8 = 2
            return r8
        L21:
            android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch: java.lang.Throwable -> L93
            java.lang.String r1 = "https"
            java.lang.String r3 = r9.getScheme()     // Catch: java.lang.Throwable -> L93
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L93
            if (r1 != 0) goto L38
            if (r0 == 0) goto L36
            r0.close()
        L36:
            r8 = 3
            return r8
        L38:
            boolean r1 = hasGeolocationPermission()     // Catch: java.lang.Throwable -> L93
            java.lang.String r3 = "Geolocation.HeaderSentOrNot"
            r4 = 8
            r5 = 4
            java.lang.String r6 = "GeolocationHeader"
            r7 = 0
            if (r1 != 0) goto L59
            if (r10 == 0) goto L4c
            r8 = 5
            defpackage.EI2.h(r8, r4, r3)     // Catch: java.lang.Throwable -> L93
        L4c:
            java.lang.String r8 = "[crbug/1338183] App permission is missing"
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L93
            defpackage.AbstractC4851eH1.d(r6, r8, r9)     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L58
            r0.close()
        L58:
            return r5
        L59:
            java.lang.String r1 = r9.toString()     // Catch: java.lang.Throwable -> L93
            boolean r1 = J.N.MwP0orC3(r8, r1)     // Catch: java.lang.Throwable -> L93
            if (r1 == 0) goto L77
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L93
            int r8 = J.N.MrCE1oma(r8, r5, r9, r9)     // Catch: java.lang.Throwable -> L93
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L93
            int r8 = r8.intValue()     // Catch: java.lang.Throwable -> L93
            if (r8 != r2) goto L77
            r8 = r2
            goto L78
        L77:
            r8 = r7
        L78:
            r8 = r8 ^ r2
            if (r8 == 0) goto L8d
            if (r10 == 0) goto L80
            defpackage.EI2.h(r7, r4, r3)     // Catch: java.lang.Throwable -> L93
        L80:
            java.lang.String r8 = "[crbug/1338183] Site permission is missing"
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L93
            defpackage.AbstractC4851eH1.d(r6, r8, r9)     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L8c
            r0.close()
        L8c:
            return r5
        L8d:
            if (r0 == 0) goto L92
            r0.close()
        L92:
            return r7
        L93:
            r8 = move-exception
            if (r0 == 0) goto L99
            r0.close()     // Catch: java.lang.Throwable -> L99
        L99:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.omnibox.geo.GeolocationHeader.c(org.chromium.chrome.browser.profiles.Profile, java.lang.String, boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x00dd, code lost:            if (r10 == null) goto L772;     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x028b A[Catch: all -> 0x02dc, TryCatch #5 {all -> 0x02dc, blocks: (B:3:0x0010, B:5:0x002d, B:8:0x0037, B:9:0x0055, B:16:0x0065, B:20:0x0075, B:22:0x007d, B:23:0x00b9, B:29:0x00df, B:30:0x00e2, B:36:0x0102, B:45:0x023b, B:49:0x024f, B:52:0x025f, B:53:0x027d, B:58:0x0296, B:60:0x028b, B:61:0x025e, B:66:0x0269, B:67:0x0299, B:74:0x02ab, B:77:0x02b6, B:79:0x02be, B:80:0x02c4, B:86:0x022e, B:191:0x0109, B:194:0x0110, B:199:0x02d4, B:213:0x02db, B:219:0x0080, B:221:0x00ac, B:224:0x009c, B:228:0x0041, B:230:0x004c, B:231:0x0051, B:25:0x00c3, B:205:0x00ce, B:32:0x00e8), top: B:2:0x0010, inners: #2, #3, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String d(java.lang.String r22, org.chromium.chrome.browser.profiles.Profile r23, org.chromium.chrome.browser.tab.Tab r24) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.omnibox.geo.GeolocationHeader.d(java.lang.String, org.chromium.chrome.browser.profiles.Profile, org.chromium.chrome.browser.tab.Tab):java.lang.String");
    }

    public static int e() {
        TraceEvent i = TraceEvent.i("GeolocationHeader.getLocationSource", null);
        try {
            try {
                int i2 = Settings.Secure.getInt(V60.a.getContentResolver(), "location_mode");
                if (i2 == 3) {
                    if (i != null) {
                        i.close();
                    }
                    return 0;
                }
                if (i2 == 1) {
                    if (i != null) {
                        i.close();
                    }
                    return 2;
                }
                if (i2 == 2) {
                    if (i != null) {
                        i.close();
                    }
                    return 1;
                }
                if (i != null) {
                    i.close();
                }
                return 3;
            } catch (Settings.SettingNotFoundException unused) {
                AbstractC4851eH1.a("GeolocationHeader", "Error getting the LOCATION_MODE", new Object[0]);
                if (i != null) {
                    i.close();
                }
                return 3;
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused2) {
                }
            }
            throw th;
        }
    }

    public static void g(long j, int i, boolean z) {
        String str;
        if (i == 0) {
            str = z ? "Geolocation.Header.TimeListening.HighAccuracy.LocationAttached" : "Geolocation.Header.TimeListening.HighAccuracy.LocationNotAttached";
        } else if (i == 1) {
            str = z ? "Geolocation.Header.TimeListening.BatterySaving.LocationAttached" : "Geolocation.Header.TimeListening.BatterySaving.LocationNotAttached";
        } else if (i != 2) {
            AbstractC4851eH1.a("GeolocationHeader", AbstractC9076qb1.a("Unexpected locationSource: ", i), new Object[0]);
            str = null;
        } else {
            str = z ? "Geolocation.Header.TimeListening.GpsOnly.LocationAttached" : "Geolocation.Header.TimeListening.GpsOnly.LocationNotAttached";
        }
        String str2 = str;
        if (str2 == null) {
            return;
        }
        EI2.g(str2, j, 1L, 3000000L, 50);
    }

    public static String a(Location location) {
        if (location == null) {
            return null;
        }
        long time = location.getTime() * 1000;
        int latitude = (int) (location.getLatitude() * 1.0E7d);
        int longitude = (int) (location.getLongitude() * 1.0E7d);
        int accuracy = (int) (location.getAccuracy() * 1000.0f);
        C1997Pj2 c1997Pj2 = (C1997Pj2) C2127Qj2.m.j();
        if (c1997Pj2.h) {
            c1997Pj2.l();
            c1997Pj2.h = false;
        }
        C2127Qj2 c2127Qj2 = (C2127Qj2) c1997Pj2.g;
        c2127Qj2.j |= 1;
        c2127Qj2.k = latitude;
        if (c1997Pj2.h) {
            c1997Pj2.l();
            c1997Pj2.h = false;
        }
        C2127Qj2 c2127Qj22 = (C2127Qj2) c1997Pj2.g;
        c2127Qj22.j |= 2;
        c2127Qj22.l = longitude;
        C2127Qj2 c2127Qj23 = (C2127Qj2) c1997Pj2.j();
        C2257Rj2 c2257Rj2 = (C2257Rj2) C2387Sj2.q.j();
        if (c2257Rj2.h) {
            c2257Rj2.l();
            c2257Rj2.h = false;
        }
        C2387Sj2 c2387Sj2 = (C2387Sj2) c2257Rj2.g;
        c2387Sj2.getClass();
        c2127Qj23.getClass();
        c2387Sj2.n = c2127Qj23;
        c2387Sj2.j |= 8;
        if (c2257Rj2.h) {
            c2257Rj2.l();
            c2257Rj2.h = false;
        }
        C2387Sj2 c2387Sj22 = (C2387Sj2) c2257Rj2.g;
        c2387Sj22.getClass();
        c2387Sj22.k = 1;
        c2387Sj22.j |= 1;
        if (c2257Rj2.h) {
            c2257Rj2.l();
            c2257Rj2.h = false;
        }
        C2387Sj2 c2387Sj23 = (C2387Sj2) c2257Rj2.g;
        c2387Sj23.getClass();
        c2387Sj23.l = 12;
        c2387Sj23.j |= 2;
        if (c2257Rj2.h) {
            c2257Rj2.l();
            c2257Rj2.h = false;
        }
        C2387Sj2 c2387Sj24 = (C2387Sj2) c2257Rj2.g;
        c2387Sj24.j |= 4;
        c2387Sj24.m = time;
        float f = accuracy;
        if (c2257Rj2.h) {
            c2257Rj2.l();
            c2257Rj2.h = false;
        }
        C2387Sj2 c2387Sj25 = (C2387Sj2) c2257Rj2.g;
        c2387Sj25.j |= 16;
        c2387Sj25.o = f;
        return Base64.encodeToString(((C2387Sj2) c2257Rj2.j()).toByteArray(), 10);
    }

    public static String b(C12189zf4 c12189zf4) {
        C12189zf4 c12189zf42;
        C11846yf4 c11846yf4;
        if (c12189zf4 != null && !c12189zf4.a()) {
            C11846yf4 c11846yf42 = c12189zf4.a;
            if (h(c11846yf42)) {
                c11846yf42 = null;
            }
            C11503xf4 c11503xf4 = c12189zf4.b;
            Set<C11503xf4> set = c12189zf4.d;
            if (set != null) {
                for (C11503xf4 c11503xf42 : set) {
                    if (!Objects.equals(c11503xf4, c11503xf42)) {
                        break;
                    }
                }
            }
            c11503xf42 = null;
            Set<C11846yf4> set2 = c12189zf4.c;
            if (set2 != null) {
                c11846yf4 = null;
                for (C11846yf4 c11846yf43 : set2) {
                    if (!h(c11846yf43)) {
                        if (Objects.equals(c11846yf42, c11846yf43)) {
                            c11846yf42 = c11846yf43;
                        } else if (c11846yf4 == null || c11846yf4.c.intValue() > c11846yf43.c.intValue()) {
                            c11846yf4 = c11846yf43;
                        }
                    }
                }
            } else {
                c11846yf4 = null;
            }
            if (c11503xf4 != null || c11846yf42 != null || c11503xf42 != null || c11846yf4 != null) {
                c12189zf42 = new C12189zf4(c11846yf42, c11503xf4, c11846yf4 != null ? AbstractC9048qW.d(c11846yf4) : null, c11503xf42 != null ? AbstractC9048qW.d(c11503xf42) : null);
                if (c12189zf42 != null || c12189zf42.a()) {
                    return null;
                }
                C2257Rj2 c2257Rj2 = (C2257Rj2) C2387Sj2.q.j();
                if (c2257Rj2.h) {
                    c2257Rj2.l();
                    c2257Rj2.h = false;
                }
                C2387Sj2 c2387Sj2 = (C2387Sj2) c2257Rj2.g;
                c2387Sj2.getClass();
                c2387Sj2.k = 1;
                c2387Sj2.j |= 1;
                if (c2257Rj2.h) {
                    c2257Rj2.l();
                    c2257Rj2.h = false;
                }
                C2387Sj2 c2387Sj22 = (C2387Sj2) c2257Rj2.g;
                c2387Sj22.getClass();
                c2387Sj22.l = 12;
                c2387Sj22.j |= 2;
                C11846yf4 c11846yf44 = c12189zf42.a;
                if (c11846yf44 != null) {
                    c2257Rj2.o(c11846yf44.a(true));
                }
                Set set3 = c12189zf42.c;
                if (set3 != null) {
                    Iterator it = set3.iterator();
                    while (it.hasNext()) {
                        c2257Rj2.o(((C11846yf4) it.next()).a(false));
                    }
                }
                C11503xf4 c11503xf43 = c12189zf42.b;
                if (c11503xf43 != null) {
                    c2257Rj2.o(c11503xf43.b(true));
                }
                Set set4 = c12189zf42.d;
                if (set4 != null) {
                    Iterator it2 = set4.iterator();
                    while (it2.hasNext()) {
                        c2257Rj2.o(((C11503xf4) it2.next()).b(false));
                    }
                }
                return Base64.encodeToString(((C2387Sj2) c2257Rj2.j()).toByteArray(), 10);
            }
        }
        c12189zf42 = null;
        if (c12189zf42 != null) {
        }
        return null;
    }

    public static boolean h(C11846yf4 c11846yf4) {
        if (c11846yf4 == null || c11846yf4.b == null) {
            return true;
        }
        String str = c11846yf4.a;
        if (str == null || str.indexOf(95) < 0) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        return lowerCase.contains("_nomap") || lowerCase.contains("_optout");
    }
}
