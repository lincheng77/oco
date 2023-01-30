"use strict";
const common_vendor = require("../../common/vendor.js");
const _sfc_main = {
  data() {
    return {
      title: "Hello"
    };
  },
  onLoad() {
  },
  methods: {}
};
function _sfc_render(_ctx, _cache, $props, $setup, $data, $options) {
  return {
    a: common_vendor.t($data.title)
  };
}
const MiniProgramPage = /* @__PURE__ */ common_vendor._export_sfc(_sfc_main, [["render", _sfc_render], ["__file", "/Users/dingmengdi/Developer/code/applet/learn/uni-app\u4ECE\u5165\u95E8\u5230\u8FDB\u9636\u7CFB\u7EDF\u5B8C\u6210\u9879\u76EE\u5B9E\u6218/oco-wx/pages/index/index.vue"]]);
wx.createPage(MiniProgramPage);
