package org.chromium.chrome.browser.complex_tasks;

import defpackage.C2313Ru3;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class TaskTabHelper {
    public static long getParentTaskId(Tab tab) {
        Long l = (Long) C2313Ru3.a(tab).b("ParentTaskId");
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    public static long getParentRootTaskId(Tab tab) {
        Long l = (Long) C2313Ru3.a(tab).b("ParentRootTaskId");
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }
}
