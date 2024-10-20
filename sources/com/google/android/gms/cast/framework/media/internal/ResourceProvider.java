package com.google.android.gms.cast.framework.media.internal;

import com.android.chrome.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ResourceProvider {
    public static final Map a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("smallIconDrawableResId", Integer.valueOf(R.drawable.f45540_resource_name_obfuscated_res_0x7f090111));
        hashMap.put("stopLiveStreamDrawableResId", Integer.valueOf(R.drawable.f45550_resource_name_obfuscated_res_0x7f090112));
        hashMap.put("pauseDrawableResId", Integer.valueOf(R.drawable.f45470_resource_name_obfuscated_res_0x7f09010a));
        hashMap.put("playDrawableResId", Integer.valueOf(R.drawable.f45480_resource_name_obfuscated_res_0x7f09010b));
        hashMap.put("skipNextDrawableResId", Integer.valueOf(R.drawable.f45520_resource_name_obfuscated_res_0x7f09010f));
        hashMap.put("skipPrevDrawableResId", Integer.valueOf(R.drawable.f45530_resource_name_obfuscated_res_0x7f090110));
        hashMap.put("forwardDrawableResId", Integer.valueOf(R.drawable.f45440_resource_name_obfuscated_res_0x7f090106));
        hashMap.put("forward10DrawableResId", Integer.valueOf(R.drawable.f45450_resource_name_obfuscated_res_0x7f090107));
        hashMap.put("forward30DrawableResId", Integer.valueOf(R.drawable.f45460_resource_name_obfuscated_res_0x7f090108));
        hashMap.put("rewindDrawableResId", Integer.valueOf(R.drawable.f45490_resource_name_obfuscated_res_0x7f09010c));
        hashMap.put("rewind10DrawableResId", Integer.valueOf(R.drawable.f45500_resource_name_obfuscated_res_0x7f09010d));
        hashMap.put("rewind30DrawableResId", Integer.valueOf(R.drawable.f45510_resource_name_obfuscated_res_0x7f09010e));
        hashMap.put("disconnectDrawableResId", Integer.valueOf(R.drawable.f45430_resource_name_obfuscated_res_0x7f090105));
        hashMap.put("notificationImageSizeDimenResId", Integer.valueOf(R.dimen.f28800_resource_name_obfuscated_res_0x7f0800c9));
        hashMap.put("castingToDeviceStringResId", Integer.valueOf(R.string.f69920_resource_name_obfuscated_res_0x7f1402f8));
        hashMap.put("stopLiveStreamStringResId", Integer.valueOf(R.string.f70060_resource_name_obfuscated_res_0x7f14031c));
        hashMap.put("pauseStringResId", Integer.valueOf(R.string.f69990_resource_name_obfuscated_res_0x7f140313));
        hashMap.put("playStringResId", Integer.valueOf(R.string.f70000_resource_name_obfuscated_res_0x7f140314));
        hashMap.put("skipNextStringResId", Integer.valueOf(R.string.f70040_resource_name_obfuscated_res_0x7f140319));
        hashMap.put("skipPrevStringResId", Integer.valueOf(R.string.f70050_resource_name_obfuscated_res_0x7f14031a));
        hashMap.put("forwardStringResId", Integer.valueOf(R.string.f69960_resource_name_obfuscated_res_0x7f140307));
        hashMap.put("forward10StringResId", Integer.valueOf(R.string.f69970_resource_name_obfuscated_res_0x7f140308));
        hashMap.put("forward30StringResId", Integer.valueOf(R.string.f69980_resource_name_obfuscated_res_0x7f140309));
        hashMap.put("rewindStringResId", Integer.valueOf(R.string.f70010_resource_name_obfuscated_res_0x7f140315));
        hashMap.put("rewind10StringResId", Integer.valueOf(R.string.f70020_resource_name_obfuscated_res_0x7f140316));
        hashMap.put("rewind30StringResId", Integer.valueOf(R.string.f70030_resource_name_obfuscated_res_0x7f140317));
        hashMap.put("disconnectStringResId", Integer.valueOf(R.string.f69940_resource_name_obfuscated_res_0x7f1402fd));
        a = Collections.unmodifiableMap(hashMap);
    }

    public static Integer findResourceByName(String str) {
        if (str == null) {
            return null;
        }
        return (Integer) a.get(str);
    }
}
