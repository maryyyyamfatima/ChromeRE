package org.chromium.chrome.browser.video_tutorials.bridges;

import java.util.ArrayList;
import java.util.List;
import org.chromium.chrome.browser.video_tutorials.Tutorial;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TutorialConversionBridge {
    public static List createTutorialList() {
        return new ArrayList();
    }

    public static Tutorial createTutorialAndMaybeAddToList(List list, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2) {
        Tutorial tutorial = new Tutorial(i, str, str2, str3, str4, str5, str6, str7, i2);
        if (list != null) {
            list.add(tutorial);
        }
        return tutorial;
    }
}
