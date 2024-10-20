package defpackage;

import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueContainerMetadata;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yO1 */
/* loaded from: classes.dex */
public final class C11753yO1 {
    public final MediaQueueData a = new MediaQueueData(0);

    public final void a(JSONObject jSONObject) {
        MediaQueueData mediaQueueData = this.a;
        mediaQueueData.a = null;
        mediaQueueData.g = null;
        mediaQueueData.h = 0;
        mediaQueueData.i = null;
        mediaQueueData.k = 0;
        mediaQueueData.l = null;
        mediaQueueData.m = 0;
        mediaQueueData.n = -1L;
        mediaQueueData.o = false;
        if (jSONObject == null) {
            return;
        }
        mediaQueueData.a = WH.c(jSONObject, "id");
        mediaQueueData.g = WH.c(jSONObject, "entity");
        String optString = jSONObject.optString("queueType");
        optString.getClass();
        char c = 65535;
        switch (optString.hashCode()) {
            case -1803151310:
                if (optString.equals("PODCAST_SERIES")) {
                    c = 0;
                    break;
                }
                break;
            case -1758903120:
                if (optString.equals("RADIO_STATION")) {
                    c = 1;
                    break;
                }
                break;
            case -1632865838:
                if (optString.equals("PLAYLIST")) {
                    c = 2;
                    break;
                }
                break;
            case -1319760993:
                if (optString.equals("AUDIOBOOK")) {
                    c = 3;
                    break;
                }
                break;
            case -1088524588:
                if (optString.equals("TV_SERIES")) {
                    c = 4;
                    break;
                }
                break;
            case 62359119:
                if (optString.equals("ALBUM")) {
                    c = 5;
                    break;
                }
                break;
            case 73549584:
                if (optString.equals("MOVIE")) {
                    c = 6;
                    break;
                }
                break;
            case 393100598:
                if (optString.equals("VIDEO_PLAYLIST")) {
                    c = 7;
                    break;
                }
                break;
            case 902303413:
                if (optString.equals("LIVE_TV")) {
                    c = '\b';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                mediaQueueData.h = 5;
                break;
            case 1:
                mediaQueueData.h = 4;
                break;
            case 2:
                mediaQueueData.h = 2;
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                mediaQueueData.h = 3;
                break;
            case 4:
                mediaQueueData.h = 6;
                break;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                mediaQueueData.h = 1;
                break;
            case 6:
                mediaQueueData.h = 9;
                break;
            case 7:
                mediaQueueData.h = 7;
                break;
            case '\b':
                mediaQueueData.h = 8;
                break;
        }
        mediaQueueData.i = WH.c(jSONObject, "name");
        JSONObject optJSONObject = jSONObject.has("containerMetadata") ? jSONObject.optJSONObject("containerMetadata") : null;
        if (optJSONObject != null) {
            MediaQueueContainerMetadata mediaQueueContainerMetadata = new MediaQueueContainerMetadata(0);
            mediaQueueContainerMetadata.a = 0;
            mediaQueueContainerMetadata.g = null;
            mediaQueueContainerMetadata.h = null;
            mediaQueueContainerMetadata.i = null;
            mediaQueueContainerMetadata.j = 0.0d;
            String optString2 = optJSONObject.optString("containerType", "");
            optString2.getClass();
            if (optString2.equals("AUDIOBOOK_CONTAINER")) {
                mediaQueueContainerMetadata.a = 1;
            } else if (optString2.equals("GENERIC_CONTAINER")) {
                mediaQueueContainerMetadata.a = 0;
            }
            mediaQueueContainerMetadata.g = WH.c(optJSONObject, "title");
            JSONArray optJSONArray = optJSONObject.optJSONArray("sections");
            if (optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                mediaQueueContainerMetadata.h = arrayList;
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    if (optJSONObject2 != null) {
                        MediaMetadata mediaMetadata = new MediaMetadata();
                        mediaMetadata.s1(optJSONObject2);
                        arrayList.add(mediaMetadata);
                    }
                }
            }
            JSONArray optJSONArray2 = optJSONObject.optJSONArray("containerImages");
            if (optJSONArray2 != null) {
                ArrayList arrayList2 = new ArrayList();
                mediaQueueContainerMetadata.i = arrayList2;
                C4856eI1 c4856eI1 = WW1.a;
                try {
                    arrayList2.clear();
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        try {
                            arrayList2.add(new WebImage(optJSONArray2.getJSONObject(i2)));
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                } catch (JSONException unused2) {
                }
            }
            mediaQueueContainerMetadata.j = optJSONObject.optDouble("containerDuration", mediaQueueContainerMetadata.j);
            mediaQueueData.j = new MediaQueueContainerMetadata(mediaQueueContainerMetadata);
        }
        Integer a = AbstractC4194cN1.a(jSONObject.optString("repeatMode"));
        if (a != null) {
            mediaQueueData.k = a.intValue();
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("items");
        if (optJSONArray3 != null) {
            ArrayList arrayList3 = new ArrayList();
            mediaQueueData.l = arrayList3;
            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                JSONObject optJSONObject3 = optJSONArray3.optJSONObject(i3);
                if (optJSONObject3 != null) {
                    try {
                        arrayList3.add(new MediaQueueItem(optJSONObject3));
                    } catch (JSONException unused3) {
                    }
                }
            }
        }
        mediaQueueData.m = jSONObject.optInt("startIndex", mediaQueueData.m);
        if (jSONObject.has("startTime")) {
            mediaQueueData.n = WH.d(jSONObject.optDouble("startTime", mediaQueueData.n));
        }
        mediaQueueData.o = jSONObject.optBoolean("shuffle");
    }
}
