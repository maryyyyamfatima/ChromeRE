package defpackage;

import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: t01, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9908t01 {
    public static final String[] a = {"text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity", "thing_proto"};
    public static final HashMap b = new HashMap(10);

    static {
        int i = 0;
        while (true) {
            String[] strArr = a;
            if (i >= 10) {
                return;
            }
            b.put(strArr[i], Integer.valueOf(i));
            i++;
        }
    }
}
