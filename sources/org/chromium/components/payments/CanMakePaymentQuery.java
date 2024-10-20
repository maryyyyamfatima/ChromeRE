package org.chromium.components.payments;

import defpackage.C6755jp2;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class CanMakePaymentQuery {
    public static String[] getMethodIdentifiers(Map map) {
        return (String[]) map.keySet().toArray(new String[map.size()]);
    }

    public static String getStringifiedMethodData(Map map, String str) {
        return ((C6755jp2) map.get(str)).c;
    }
}
