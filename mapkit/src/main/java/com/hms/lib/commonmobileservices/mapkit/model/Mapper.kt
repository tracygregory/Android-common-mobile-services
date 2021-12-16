// Copyright 2020. Explore in HMS. All rights reserved.
// 
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at

// http://www.apache.org/licenses/LICENSE-2.0

// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.hms.lib.commonmobileservices.mapkit.model

fun com.huawei.hms.maps.model.Polygon.toPolygon() : Polygon = Polygon(this)
fun com.huawei.hms.maps.model.Polyline.toPolyline() : Polyline = Polyline(this)

fun com.google.android.gms.maps.model.Polygon.toPolygon() : Polygon = Polygon(this)
fun com.google.android.gms.maps.model.Polyline.toPolyline() : Polyline = Polyline(this)

fun PolygonOptions.toHMSPolygonOptions() : com.huawei.hms.maps.model.PolygonOptions {
    return com.huawei.hms.maps.model.PolygonOptions().addAll(baseLatLngs.map { it.toHMSLatLng() }).also { hmsOpts->
        strokeColor?.let {hmsOpts.strokeColor(it)}
        strokeWidth?.let {hmsOpts.strokeWidth(it)}
    }
}

fun LatLng.toHMSLatLng() : com.huawei.hms.maps.model.LatLng {
    return com.huawei.hms.maps.model.LatLng(lat,lng)
}

fun com.huawei.hms.maps.model.LatLng.toLatLng() : LatLng {
    return LatLng(latitude,longitude)
}

fun LatLng.toGMSLatLng() : com.google.android.gms.maps.model.LatLng{
    return com.google.android.gms.maps.model.LatLng(lat,lng)
}

fun com.google.android.gms.maps.model.LatLng.toLatLng() : LatLng {
    return LatLng(latitude,longitude)
}


fun PolygonOptions.toGMSPolygonOptions() : com.google.android.gms.maps.model.PolygonOptions{
    return com.google.android.gms.maps.model.PolygonOptions().
    addAll(baseLatLngs.map { it.toGMSLatLng() }).also {gmsOpts->
        strokeColor?.let {gmsOpts.strokeColor(it)}
        strokeWidth?.let {gmsOpts.strokeWidth(it)}
    }
}

fun PolylineOptions.toHMSPolylineOptions() : com.huawei.hms.maps.model.PolylineOptions {
    return com.huawei.hms.maps.model.PolylineOptions().addAll(baseLatLngs.map { it.toHMSLatLng() }).also { hmsOpts->
        Color?.let {hmsOpts.color(it)}
        Width?.let {hmsOpts.width(it)}
    }
}

fun PolylineOptions.toGMSPolylineOptions() : com.google.android.gms.maps.model.PolylineOptions{
    return com.google.android.gms.maps.model.PolylineOptions().
    addAll(baseLatLngs.map { it.toGMSLatLng() }).also {gmsOpts->
        Color?.let {gmsOpts.color(it)}
        Width?.let {gmsOpts.width(it)}
    }
}



