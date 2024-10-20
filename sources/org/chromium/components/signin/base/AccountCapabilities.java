package org.chromium.components.signin.base;

import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AccountCapabilities {
    public final HashMap a;

    public AccountCapabilities(String[] strArr, boolean[] zArr) {
        this.a = new HashMap();
        for (int i = 0; i < strArr.length; i++) {
            this.a.put(strArr[i], Boolean.valueOf(zArr[i]));
        }
    }

    public AccountCapabilities(HashMap hashMap) {
        this.a = hashMap;
    }

    public final int getCapabilityByName(String str) {
        HashMap hashMap = this.a;
        if (hashMap.containsKey(str)) {
            return ((Boolean) hashMap.get(str)).booleanValue() ? 1 : 0;
        }
        return -1;
    }
}
