package org.chromium.chrome.browser.usage_stats;

import J.N;
import defpackage.AbstractC7533m44;
import defpackage.C10964w44;
import defpackage.C1127Ir1;
import defpackage.C12243zo4;
import defpackage.C2254Rj;
import defpackage.C6827k14;
import defpackage.C7931nE2;
import defpackage.DD0;
import defpackage.GD0;
import defpackage.HD0;
import defpackage.ID0;
import defpackage.MC2;
import defpackage.OD0;
import defpackage.QW2;
import defpackage.QX0;
import defpackage.XF0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class UsageStatsBridge {
    public final C10964w44 a;
    public final long b;

    public UsageStatsBridge(Profile profile, C10964w44 c10964w44) {
        this.b = N.MZTYueAb(this, profile);
        this.a = c10964w44;
    }

    public final void a(HashMap hashMap, Callback callback) {
        String[] strArr = new String[hashMap.size()];
        String[] strArr2 = new String[hashMap.size()];
        int i = 0;
        for (Map.Entry entry : hashMap.entrySet()) {
            strArr[i] = (String) entry.getKey();
            strArr2[i] = (String) entry.getValue();
            i++;
        }
        N.Mz1N0m$q(this.b, this, strArr, strArr2, callback);
    }

    public static void createMapAndRunCallback(String[] strArr, String[] strArr2, Callback callback) {
        HashMap hashMap = new HashMap(strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            hashMap.put(strArr[i], strArr2[i]);
        }
        callback.onResult(hashMap);
    }

    public static void createEventListAndRunCallback(byte[][] bArr, Callback callback) {
        C12243zo4 c12243zo4;
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] bArr2 : bArr) {
            try {
                C12243zo4 c12243zo42 = C12243zo4.n;
                int length = bArr2.length;
                XF0 c = XF0.c();
                c12243zo4 = new C12243zo4();
                try {
                    try {
                        C7931nE2 c7931nE2 = C7931nE2.c;
                        c7931nE2.getClass();
                        QW2 b = c7931nE2.b(c12243zo4.getClass());
                        b.f(c12243zo4, bArr2, 0, length + 0, new C2254Rj(c));
                        b.b(c12243zo4);
                    } catch (IOException e) {
                        if (e.getCause() instanceof C1127Ir1) {
                            throw ((C1127Ir1) e.getCause());
                        }
                        throw new C1127Ir1(e);
                    } catch (IndexOutOfBoundsException unused) {
                        throw C1127Ir1.h();
                    }
                } catch (C1127Ir1 e2) {
                    if (e2.g) {
                        throw new C1127Ir1(e2);
                    }
                    throw e2;
                } catch (C6827k14 e3) {
                    throw e3.a();
                }
            } catch (C1127Ir1 unused2) {
            }
            if (c12243zo4.a != 0) {
                throw new RuntimeException();
                break;
            } else {
                QX0.i(c12243zo4);
                arrayList.add(c12243zo4);
            }
        }
        callback.onResult(arrayList);
    }

    public final void onAllHistoryDeleted() {
        final C10964w44 c10964w44 = this.a;
        c10964w44.getClass();
        Object obj = ThreadUtils.a;
        AbstractC7533m44.a(7);
        c10964w44.g.a();
        OD0 od0 = c10964w44.b;
        od0.getClass();
        MC2 mc2 = new MC2();
        od0.b.h(new HD0(od0, mc2), new DD0());
        mc2.a(new Callback() { // from class: p44
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                OD0 od02 = C10964w44.this.b;
                od02.getClass();
                MC2 mc22 = new MC2();
                od02.b.h(new HD0(od02, mc22), new DD0());
                mc22.a(new Callback() { // from class: r44
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj3) {
                        return new ZE(this, obj3);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj3) {
                        AbstractC4851eH1.a("UsageStatsService", "Failed to clear all events for history deletion", new Object[0]);
                    }
                });
            }
        });
    }

    public final void onHistoryDeletedInRange(final long j, final long j2) {
        final C10964w44 c10964w44 = this.a;
        c10964w44.getClass();
        Object obj = ThreadUtils.a;
        AbstractC7533m44.a(8);
        long min = Math.min(j2, System.currentTimeMillis());
        c10964w44.g.b(j, min);
        OD0 od0 = c10964w44.b;
        od0.getClass();
        MC2 mc2 = new MC2();
        od0.b.h(new ID0(od0, j, min, mc2), new DD0());
        mc2.a(new Callback() { // from class: q44
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                OD0 od02 = C10964w44.this.b;
                long j3 = j;
                long j4 = j2;
                od02.getClass();
                MC2 mc22 = new MC2();
                od02.b.h(new ID0(od02, j3, j4, mc22), new DD0());
                mc22.a(new Callback() { // from class: t44
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj3) {
                        return new ZE(this, obj3);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj3) {
                        AbstractC4851eH1.a("UsageStatsService", "Failed to clear range of events for history deletion", new Object[0]);
                    }
                });
            }
        });
    }

    public final void onHistoryDeletedForDomains(String[] strArr) {
        final ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        final C10964w44 c10964w44 = this.a;
        c10964w44.getClass();
        Object obj = ThreadUtils.a;
        AbstractC7533m44.a(9);
        c10964w44.g.c(arrayList);
        OD0 od0 = c10964w44.b;
        od0.getClass();
        MC2 mc2 = new MC2();
        od0.b.h(new GD0(arrayList, mc2, od0), new DD0());
        mc2.a(new Callback() { // from class: n44
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                OD0 od02 = C10964w44.this.b;
                od02.getClass();
                MC2 mc22 = new MC2();
                od02.b.h(new GD0(arrayList, mc22, od02), new DD0());
                mc22.a(new Callback() { // from class: s44
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj3) {
                        return new ZE(this, obj3);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj3) {
                        AbstractC4851eH1.a("UsageStatsService", "Failed to clear domain events for history deletion", new Object[0]);
                    }
                });
            }
        });
    }
}
