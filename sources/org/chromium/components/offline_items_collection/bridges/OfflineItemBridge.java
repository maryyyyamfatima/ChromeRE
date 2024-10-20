package org.chromium.components.offline_items_collection.bridges;

import defpackage.C4266cb2;
import defpackage.C6161i50;
import java.util.ArrayList;
import org.chromium.components.offline_items_collection.OfflineItem;
import org.chromium.components.offline_items_collection.OfflineItemSchedule;
import org.chromium.components.offline_items_collection.UpdateDelta;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class OfflineItemBridge {
    public static ArrayList createArrayList() {
        return new ArrayList();
    }

    public static OfflineItem createOfflineItemAndMaybeAddToList(ArrayList arrayList, String str, String str2, String str3, String str4, int i, boolean z, boolean z2, boolean z3, boolean z4, long j, boolean z5, long j2, long j3, long j4, boolean z6, String str5, String str6, GURL gurl, GURL gurl2, boolean z7, String str7, int i2, int i3, int i4, boolean z8, boolean z9, long j5, long j6, long j7, int i5, long j8, boolean z10, boolean z11, boolean z12, double d, OfflineItemSchedule offlineItemSchedule) {
        OfflineItem offlineItem = new OfflineItem();
        C6161i50 c6161i50 = offlineItem.a;
        c6161i50.a = str;
        c6161i50.b = str2;
        offlineItem.g = str3;
        offlineItem.h = str4;
        offlineItem.i = i;
        offlineItem.j = z;
        offlineItem.k = z2;
        offlineItem.l = z3;
        offlineItem.m = z4;
        offlineItem.p = j;
        offlineItem.q = z5;
        offlineItem.r = j2;
        offlineItem.s = j3;
        offlineItem.t = j4;
        offlineItem.u = z6;
        offlineItem.v = str5;
        offlineItem.w = str6;
        offlineItem.x = gurl;
        offlineItem.y = gurl2;
        offlineItem.z = z7;
        offlineItem.A = str7;
        offlineItem.B = i2;
        offlineItem.I = i3;
        offlineItem.f11537J = i4;
        offlineItem.C = z8;
        offlineItem.D = z9;
        offlineItem.E = j5;
        offlineItem.F = new C4266cb2(j6, j7 == -1 ? null : Long.valueOf(j7), i5);
        offlineItem.G = j8;
        offlineItem.H = z10;
        offlineItem.n = z11;
        offlineItem.o = z12;
        offlineItem.K = offlineItemSchedule;
        if (arrayList != null) {
            arrayList.add(offlineItem);
        }
        return offlineItem;
    }

    public static UpdateDelta createUpdateDelta(boolean z, boolean z2) {
        UpdateDelta updateDelta = new UpdateDelta();
        updateDelta.a = z;
        updateDelta.b = z2;
        return updateDelta;
    }

    public static OfflineItemSchedule createOfflineItemSchedule(boolean z, long j) {
        return new OfflineItemSchedule(j, z);
    }
}
